package mycinema.biz;

import java.util.List;

import mycinema.entity.Category;

public interface CategoryBiz {
	List<Category> getAll();
	Category fetchById(int id);
	void add(Category c);
	void update(Category c);
	void delete(int id);
}
