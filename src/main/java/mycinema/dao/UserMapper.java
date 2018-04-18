package mycinema.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mycinema.entity.User;

public interface UserMapper {

	@Select("select * from User where Username=#{username} and Password=#{password}")
	User checkLogin(@Param("username")String username, @Param("password")String password);

	@Select("select * from User where Username=#{username}")
	User fetchByUsername(String username);
}
