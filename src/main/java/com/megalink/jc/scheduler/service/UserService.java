package com.megalink.jc.scheduler.service;

import java.util.List;

import com.megalink.jc.model.UserInfo;

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
	
	int updateById(UserInfo record);
	
	int deleteById(Integer id);
}
