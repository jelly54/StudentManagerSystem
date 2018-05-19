package com.stuManager.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stuManager.bean.User;
import com.stuManager.service.UserService;
import com.stuManager.util.Page;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 为主页提供数据
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @param pageCurrent
	 * 			设定当前页的值
	 * @return
	 * 			返回一个map对象，便于传值
	 */
	public ModelMap dataForMain(ModelMap map, String pageCurrent) {
		Page page = new Page();
		User user = new User();
		// 计算总记录数
		int count = userService.selectCount();
		page.setItemCont(count);
		
		if (pageCurrent != null) {
			if("theLast".equals(pageCurrent))
				page.setPageCurrent(page.getPageCont());
			else
				page.setPageCurrent(Integer.parseInt(pageCurrent));
		}
		user.setItemStart(page.getItemStart());
		user.setItemEnd(page.getPageSize());
		
		// 查询所有的用户数据
		List<User> users2 = userService.selectforPage2(user);
		// 将数据添加到map中
		map.put("users", users2);
		map.put("page", page);
		return map;
	}

	/**
	 * 用于跳转回主页
	 * @param msg
	 * 			信息提示，success  或者   fail
	 * @param pageCurrent
	 * 			传入的当前页数值，没有传入 默认为 1
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @return
	 * 			跳转到主页 main.jsp
	 */
	@RequestMapping("/toMain")
	public String toMain(@ModelAttribute("msg") String msg, @RequestParam(value = "pageCurrent",defaultValue= "1") String pageCurrent,
			ModelMap map) {
		// List<User> users = userService.selectforPage();
		// System.out.println("user dangqianye "+pageCurrent);
		map = dataForMain(map, pageCurrent);

		// map.put("users", users);
		if (msg != null)
			map.put("msg", msg);
		return "main";
	}

	/**
	 * 添加用户
	 * @param user
	 * 			传入的数据封装为 user对象
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @return
	 * 			如果添加成功 添加返回信息 success  否则 添加返回信息  fail， 之后跳转到添加页面
	 * @throws ParseException
	 */
	@RequestMapping("/addUser")
	public String regist(User user, ModelMap map) throws ParseException {
		if (userService.insertSelective(user) > 0) {
			map.put("msg", "success");
		} else {
			map.put("msg", "fail");
		}
		return "addStudent";
	}

	/**
	 * 删除用户
	 * @param id
	 * 			要删除的用户的id
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @return	
	 * 			如果删除成功 添加返回信息 success  否则 添加返回信息  fail， 之后跳转到主页并传入当前页（pageCurrent=1）
	 */	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "id") Integer id, ModelMap map) {
		int flag = userService.deleteByPrimaryKey(id);
		if (flag > 0) {
			map.put("msg", "success");
		} else {
			map.put("msg", "fail");
		}
		return "redirect:/toMain.do?pageCurrent=1";
	}

	/**
	 * 更新用户 用于数据回显
	 * @param id
	 * 			要更新用户的id
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @return
	 * 			获取将要更新的用户，放到作用域 跳转到更新用户界面
	 */
	@RequestMapping("/update")
	public String forUpdateStudent(@RequestParam(value = "id") Integer id, ModelMap map) {
		User user = userService.selectByPrimaryKey(id);
		map.put("user", user);
		return "updateStudent";
	}

	/**
	 * 执行更新用户操作
	 * @param user
	 * 			传入的数据封装成user对象
	 * @param sbirthday
	 * 			生日需要处理后在传入，所以单独拿出来
	 * @param map
	 * 			用于传递控制方法处理数据到结果页面
	 * @return
	 * 			如果更新成功 添加返回信息 success  否则 添加返回信息  fail， 之后跳转到主页并传入当前页（pageCurrent=1）
	 * @throws ParseException
	 */
	@RequestMapping("/doUpdate")
	public String updateStudent(User user, String sbirthday, ModelMap map) throws ParseException {
		if (sbirthday == "") {
			user.setBirthday(null);
		} else { //将传入的日期格式化之后再传入 进行更新
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirthday(sdf.parse(sbirthday));
		}
		int flag = userService.updateByPrimaryKeySelective(user);
		if (flag > 0) {
			map.put("msg", "success");
		} else {
			map.put("msg", "fail");
		}
		return "redirect:/toMain.do?pageCurrent=1";
	}

}
