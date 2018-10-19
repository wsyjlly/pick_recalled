/**
 * 
 */
package cn.wsyjlly.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.wsyjlly.entity.user.UCR_User;
import cn.wsyjlly.service.inter.UserService;

/**
 * @Author     	晏沈威
 * @Email	   	wsyjlly@qq.com
 * @Type_name  	ControllerTest
 * @Createtime 	2018年9月23日 下午3:25:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		UCR_User user = userService.getUserByuserID((long) 147260);
		System.out.println(user);
	}
}
