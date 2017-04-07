package com.frame.dao.impl;

import com.frame.bean.User;
import com.frame.dao.IUserInterfaceDao;

public class UserDaoImpl implements IUserInterfaceDao{

	public void AddUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("增加用户");
	}

	public void DelUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("删除用户");
	}

	public void SeekUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("查找用户");
	}

	public void Updser(User user) {
		// TODO Auto-generated method stub
		System.out.println("修改用户");
	}

}
