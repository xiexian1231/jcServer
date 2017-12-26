package com.megalink.jc.scheduler.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megalink.jc.model.UserInfo;
import com.megalink.jc.scheduler.dao.UserInfoMapper;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}

	@Override
	public int updateById(UserInfo record) {
		return userInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteById(Integer id) {
		return userInfoMapper.deleteByPrimaryKey(id);
	}

}
