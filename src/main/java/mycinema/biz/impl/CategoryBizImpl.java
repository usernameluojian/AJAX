package mycinema.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mycinema.biz.CategoryBiz;
import mycinema.dao.CategoryMapper;
import mycinema.entity.Category;

@Service
public class CategoryBizImpl implements CategoryBiz {
	
	@Autowired
	private CategoryMapper categoryMapper;
	

	@Override
	public List<Category> getAll() {
		return categoryMapper.getAll();
	}

	@Override
	public Category fetchById(int id) {
		return categoryMapper.fetchById(id);
	}

	@Override
	public void add(Category c) {
		categoryMapper.add(c);
	}

	@Override
	public void update(Category c) { 
		categoryMapper.update(c);
	}

	@Override
	public void delete(int id) {
		categoryMapper.delete(id);
	}

}
