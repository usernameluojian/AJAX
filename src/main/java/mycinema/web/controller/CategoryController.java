package mycinema.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@RequestMapping("/index")
	public String index(){
		return "category-index";
	}
	
	
}
