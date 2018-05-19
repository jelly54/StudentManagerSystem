package com.stuManager.service;

import java.util.List;

import com.stuManager.bean.User;

public interface  UserService {

	public abstract int insertSelective(User user);
	
	public abstract int deleteByPrimaryKey(Integer id);
	
	public abstract User selectByPrimaryKey(Integer id);
	
	public abstract int updateByPrimaryKeySelective(User user);
	
	public abstract int selectCount();
	
	public abstract  List<User> selectforPage();
	
	public abstract List<User> selectforPage2(User user);
	
}
