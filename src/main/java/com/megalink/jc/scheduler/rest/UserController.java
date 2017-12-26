package com.megalink.jc.scheduler.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.megalink.jc.model.UserInfo;
import com.megalink.jc.scheduler.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		UserInfo userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/netmarkets/jsp/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<UserInfo> userInfos = userService.getUsers();
		return userInfos;
	}
	
	@RequestMapping("/insertUser")
	public @ResponseBody int insertUser(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(3);
		userInfo.setUname("sa");
		userInfo.setUnumber(1);
		return userService.insert(userInfo);
	}
	
	@RequestMapping("/updateById")
	public @ResponseBody int updateById(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setUname("saa");
		userInfo.setUnumber(2);
		return userService.updateById(userInfo);
	}
	
	@RequestMapping("/deleteById")
	public @ResponseBody int deleteById(){
		Integer id = 3;
		return userService.deleteById(id);
	}
}
