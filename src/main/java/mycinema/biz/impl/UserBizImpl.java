package mycinema.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mycinema.biz.UserBiz;
import mycinema.dao.UserMapper;
import mycinema.entity.User;

@Service
public class UserBizImpl implements UserBiz {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User checkLogin(String username, String password) {
		return userMapper.checkLogin(username, password);
	}

	@Override
	public User fetchByUsername(String username) {
		return userMapper.fetchByUsername(username);
	}

}
