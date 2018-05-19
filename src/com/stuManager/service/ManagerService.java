package com.stuManager.service;

import com.stuManager.bean.Manager;

public interface ManagerService {
	
	public abstract boolean  checkLogin(Manager manager);
	
	public abstract Manager selectByName(String mName);
	
	public abstract int updateByPName(Manager manager);

}
