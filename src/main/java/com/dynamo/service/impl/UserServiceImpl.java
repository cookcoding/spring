/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: UserServiceImpl.java
 * Author:   Administrator
 * Date:     2015年9月25日 下午5:06:05
 * Description: 
 */
package com.dynamo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dynamo.dao.UserDao;
import com.dynamo.entity.User;
import com.dynamo.service.UserService;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public User getUserByName(String userName) {
		return userDao.getUserByName(userName);
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#getUser(com.dynamo.entity.User)
	 */
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#addUser(com.dynamo.entity.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#updateUser(com.dynamo.entity.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#deleteUser(int)
	 */
	@Override
	public void deleteUser(int UserId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	/* (non-Javadoc)
	 * @see com.dynamo.service.UserService#addUsers(java.util.List)
	 */
	@Override
	public void addUsers(List<User> list) {
		userDao.addUsers(list);
	}

}
