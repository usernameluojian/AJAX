package mycinema.biz;

import mycinema.entity.User;

public interface UserBiz {

	User checkLogin(String username, String password);
	
	User fetchByUsername(String username);
}
