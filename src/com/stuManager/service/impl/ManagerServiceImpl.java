package com.stuManager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuManager.bean.Manager;
import com.stuManager.dao.ManagerMapper;
import com.stuManager.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	private ManagerMapper managerMapper;
	
	@Override
	public boolean checkLogin(Manager manager) {
		String passdb = managerMapper.checkLogin(manager);
		System.out.println("passdb: "+passdb);
		if(manager.getmPass().equals(passdb)) {
			System.out.println("ÃÜÂëÒ»ÖÂ");
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Manager selectByName(String mName) {
		Manager manager = managerMapper.selectByName(mName);
		return manager;
	}

	@Override
	public int updateByPName(Manager manager) {
		int flag = managerMapper.updateByPName(manager);
		return flag;
	}

}
