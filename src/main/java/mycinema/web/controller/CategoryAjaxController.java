package mycinema.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mycinema.biz.CategoryBiz;
import mycinema.entity.Category;

@Controller
@RequestMapping("/ajax")
public class CategoryAjaxController {
	@Autowired
	private CategoryBiz categoryBiz;
	@ResponseBody
	@RequestMapping("/list")
	public Map<String,Object> list(){
		Map<String,Object> model = new HashMap<>();
		model.put("categories", categoryBiz.getAll());
		model.put("totalRows", 15);
		return model;
	}
	
	@ResponseBody
	@RequestMapping("/single")
	public Category single(int id){
		return categoryBiz.fetchById(id);
	}
	
	@ResponseBody
	@RequestMapping("/save")
	public Map<String,Object> save(Category category) {
		Map<String,Object> model = new HashMap<>();
		categoryBiz.update(category);
		model.put("ok", true);
		return model;
	}
}



