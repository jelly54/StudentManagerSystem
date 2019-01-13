package com.stuManager.mapper;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stuManager.bean.Manager;
import com.stuManager.bean.User;
import com.stuManager.dao.ManagerMapper;
import com.stuManager.dao.UserMapper;

public class UserMapperTest {
	 ApplicationContext applicationContext = null;
	 @org.junit.Before
	 public void initAC() {
		 applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	 }
	 
	 //����������ѯ
	 @Test
	 public void testSelectStudentByPrimaryKey() {
		 UserMapper studentMapper = (UserMapper) applicationContext.getBean("userMapper");
		 User users = studentMapper.selectByPrimaryKey(1);
		 System.out.println(users);
	 }
	 @Test
	 public void testcheckLogin() {
		ManagerMapper managerMapper = (ManagerMapper) applicationContext.getBean("managerMapper");
		Manager manager = new Manager();
		manager.setmName("tom");
		 String passdb = managerMapper.checkLogin(manager);
		 System.out.println(passdb);
	 }
	 
//	 @Test
//	 public void selectAllForPage() {
//		 UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
//		 Page page = new Page();
//		List<User> users = userMapper.selectAllForPag(page);
//		for(User u:users) {
//			System.out.println(u);
//		}
//	}
	 @Test
	 public void insertSelective() {
		 UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		 for(int i=0;i<10;i++) {
			 User record = new User();
			 record.setUsername("果冻"+i);
			 record.setSex("男");
			 record.setInstitute("大中国");
			 record.setPhone("123789121");
			 record.setSclass("754");
			 record.setBirthday(new Date());
			 record.setAddress("地球上哦");
			 userMapper.insertSelective(record);
		 }
	}
	 
	 @Test
	 public void insertManger() {
		 ManagerMapper managerMapper = (ManagerMapper) applicationContext.getBean("managerMapper");
		 for(int i=0;i<10;i++) {
			 Manager record = new Manager();
			 record.setmName("小黄人"+i);
			 record.setmPass("123");
			 record.setmAuthority("0");
			 managerMapper.insertSelective(record);
		 }
	}
	 
	 
}
