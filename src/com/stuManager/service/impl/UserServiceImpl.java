package com.stuManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuManager.bean.User;
import com.stuManager.dao.UserMapper;
import com.stuManager.service.UserService;
@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public int selectCount() {
		return userMapper.selectCount();
	}
	@Override
	public int insertSelective(User user) {
		return userMapper.insertSelective(user);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	@Override
	public List<User> selectforPage() {
		return userMapper.selectforPage();
	}
	@Override
	public List<User> selectforPage2(User user) {
		return userMapper.selectforPage2(user);
	}
	
}
