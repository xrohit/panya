package com.airavat.panya.db.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.Users;

public interface UsersRepo extends CrudRepository<Users, Long> {

	public List<Users> getByUsername(String username);
}
