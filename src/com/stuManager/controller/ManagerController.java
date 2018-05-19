package com.stuManager.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.stuManager.bean.Manager;
import com.stuManager.service.ManagerService;

@SessionAttributes("mName")
@Controller
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	/**
	 * 登陆校验
	 * 
	 * @param manager
	 *            传入的数据封装为manager
	 * @param map
	 *            用于传递控制方法处理数据到结果页面
	 * @return 权限校验成功跳转到主页（传入当前页=1），否则跳转到登录界面
	 */
	@RequestMapping("/check")
	public String login(Manager manager, ModelMap map) {
		if (managerService.checkLogin(manager)) {
			// map.put("mName", manager.getmName());
			map.addAttribute("mName", manager.getmName());
			map.put("msg", null);
			// map.put("pageCurrent", 2);
			return "redirect:/toMain.do?pageCurrent=1";
		} else {
			return "redirect:/index.jsp";
		}
	}

	/**
	 * 更新user信息
	 * 
	 * @param mName
	 *            传入的姓名,查询后做数据回显
	 * @param map
	 *            用于传递控制方法处理数据到结果页面
	 * @return 跳转到跟新Manager页面
	 */
	@RequestMapping("/updateMan")
	public String forUpdateUser(@RequestParam(value = "mName") String mName, ModelMap map) {
		// 根据 mName去数据库查询 当前manager的所有信息
		Manager manager = managerService.selectByName(mName);
		map.put("manager", manager);
		return "updateManager";
	}

	/**
	 * 更新登录着的资料
	 * 
	 * @param manager
	 *            界面传来的数据，封装为 manager
	 * @param map
	 *            用于传递控制方法处理数据到结果页面
	 * @return 更新数据成功跳转到主页（传入pageCurrent=1），否则刷新当前页，返回错误信息
	 */
	@RequestMapping("/updateManager")
	public String updateManager(Manager manager, ModelMap map) {
		int flag = managerService.updateByPName(manager);
		if (flag > 0) {
			return "redirect:/toMain.do?pageCurrent=1";
		} else {
			map.put("msg", "fail");
			return "updateManager";
		}
	}

	/**
	 * 退出登录
	 * 
	 * @param session
	 *            移除session信息
	 * @return 跳转回主页
	 */
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session) {
		session.invalidate();
		return "redirect:/index.jsp";
	}
}
