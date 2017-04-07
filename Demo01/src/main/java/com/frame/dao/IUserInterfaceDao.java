package com.frame.dao;

import com.frame.bean.User;

public interface IUserInterfaceDao {
	
	public void AddUser(User user);
	public void DelUser(User user);
	public void SeekUser(User user);
	public void Updser(User user);
	
}
