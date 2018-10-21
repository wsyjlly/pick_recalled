package cn.wsyjlly.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.wsyjlly.entity.user.UCR_User;
import cn.wsyjlly.service.inter.UserService;
import cn.wsyjlly.util.ListTool;
import cn.wsyjlly.util.UrlTool;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(value="/user/message/{id}")
	public List<?> getUserByuserID(@PathVariable("id") Long userID,HttpServletRequest request){
		UCR_User user = userService.getUserByuserID(userID);
		List<Object> list = ListTool.appendToResult("user",user);
		return list;
	}
	

	@PostMapping("/user/login")
	public Long insertUser(@RequestBody Map<String,String> map){
		System.out.println(map);
		String code = map.get("code");
		String name = map.get("uname");
		String picture = map.get("upicture");
		UCR_User user = new UCR_User();
		//请求微信服务器所需参数
	    Map<String,String> requestUrlParam = new HashMap<String,String>();
	    requestUrlParam.put("appid", "wx8db4b2d5ff52e134");	 //开发者设置中的appId
	    requestUrlParam.put("secret", "f9615cccad50e95d716ad9255c171c1a");	//开发者设置中的appSecret
	    requestUrlParam.put("js_code", code);	//小程序调用wx.login返回的code
	    requestUrlParam.put("grant_type", "authorization_code");	//默认参数
	    //请求微信服务器获取session_key与openid
		String requestUrl = " https://api.weixin.qq.com/sns/jscode2session";
	    String message = UrlTool.sendPost(requestUrl, requestUrlParam);
	    //得到openid
	    JSONObject jsonObject = JSON.parseObject(message);
	    String openID = jsonObject.getString("openid");
	    //判断此openid在数据库中是否已存在
	    int exists = userService.judgeUserExists(openID);
	    
	    if(exists==0){
	    	user.setUnickname(name);
		    user.setUpicture(picture);
		    user.setUopenID(openID);
		    //数据库插入该用户
		    userService.insertUser(user);
	    	Long result = userService.getUserIDByopenID(openID);
		    return result;
	    }else if(exists==1){
	    	Long result = userService.getUserIDByopenID(openID);
	    	return result;
	    }else{
	    	return (long) 0;
	    }
	}
}
