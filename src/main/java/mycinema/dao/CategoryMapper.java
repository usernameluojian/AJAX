package mycinema.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mycinema.entity.Category;

public interface CategoryMapper {
	@Select("select * from Category")
	List<Category> getAll();
	@Select("select * from Category where Id=#{id}")
	Category fetchById(int id);
	@Insert("insert into Category(name) values(#{name})")
	@Options(keyProperty="id",useGeneratedKeys=true)
	void add(Category c);
	@Update("update Category set name=#{name} where id=#{id}")
	void update(Category c);
	@Delete("delete from Category where id=#{id}")
	void delete(int id);
	@Select("select count(id) from Movie where CategoryId=#{id}")
	boolean checkCategoryInUse(int id);
}
