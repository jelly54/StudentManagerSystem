package com.stuManager.dao;

import com.stuManager.bean.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    
    String checkLogin(Manager manager);
    
    Manager selectByName(String mName);
    
    int updateByPName(Manager manager);
    
}