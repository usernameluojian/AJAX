package mycinema.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mycinema.biz.UserBiz;
import mycinema.entity.User;

@Controller
public class HomeController {

	@RequestMapping("/register")
	public String register(){		
		return "register";
	}
	
	@Autowired
	private UserBiz userBiz;
	
	@RequestMapping("/check-username")
	public void checkUsername(String username, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=utf-8");
		User user = userBiz.fetchByUsername(username);
		PrintWriter out = resp.getWriter();
		out.print(user==null);
	}
	
	@RequestMapping("/suggest-static")
	public String suggestStatic(){		
		return "suggest-static";
	}
	
	@RequestMapping("/suggest-dynamic")
	public String suggestDynamic(){		
		return "suggest-dynamic";
	}
}
