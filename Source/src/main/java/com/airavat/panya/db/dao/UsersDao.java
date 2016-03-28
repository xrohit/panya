package com.airavat.panya.db.dao;

import java.util.List;

import com.airavat.panya.db.entities.Users;

public interface UsersDao extends PanyaDao<Users> {

	public List<Users> getUser(String username);
}
