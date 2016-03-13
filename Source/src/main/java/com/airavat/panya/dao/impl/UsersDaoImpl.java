package com.airavat.panya.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.UsersDao;
import com.airavat.panya.db.entities.Users;

@Repository
public class UsersDaoImpl extends PanyaDaoImpl<Users> implements UsersDao {

	public UsersDaoImpl() {
		super(Users.class);
	}
}
