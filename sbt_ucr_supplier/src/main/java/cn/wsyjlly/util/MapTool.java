/**
 * 
 */
package cn.wsyjlly.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.ModelMap;

/**
 * @Author     	晏沈威
 * @Email	   	wsyjlly@qq.com
 * @Type_name  	MapTool
 * @Createtime 	2018年9月15日 下午3:07:07
 */
public class MapTool {
	public static Map<Object,Object> appendToResult(Object arg1,Object arg2) {
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put(arg1, arg2);
		return map;
	}
	

	public static ModelMap add(String arg1,Object arg2) {
		ModelMap moldelMap = new ModelMap();
		moldelMap.addAttribute(arg1, arg2);
		return moldelMap;
	}
}
