package com.stuManager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stuManager.bean.User;

@Repository
public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int selectCount();
    
    List<User> selectforPage();
    
    List<User> selectforPage2(User user);
    
}