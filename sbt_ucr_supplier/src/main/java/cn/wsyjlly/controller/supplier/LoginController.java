package cn.wsyjlly.controller.supplier;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	@Value( "${server.servlet.path}")
	public String applicationPath;
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView model,HttpServletRequest req){
		model.addObject("name","晏沈威");
		model.addObject("path",applicationPath);
		model.setViewName("login");
		System.out.println(applicationPath);
		return model;
	}
}
