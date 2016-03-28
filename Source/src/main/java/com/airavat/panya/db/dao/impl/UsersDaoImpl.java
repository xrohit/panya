package com.airavat.panya.db.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.UsersDao;
import com.airavat.panya.db.entities.Users;

@Repository
public class UsersDaoImpl extends PanyaDaoImpl<Users> implements UsersDao {

	public UsersDaoImpl() {
		super(Users.class);
	}

	/**
	 * retrieve user entity for given username
	 * 
	 * @param username
	 * @return
	 */
	public List<Users> getUser(String username) {

		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Users> criteriaQuery = builder.createQuery(Users.class);
		Root<Users> userRoot = criteriaQuery.from(Users.class);
		criteriaQuery.select(userRoot);
		criteriaQuery.where(builder.equal(userRoot.get("username"), username));
		List<Users> users = getEntityManager().createQuery(criteriaQuery).getResultList();
		return users;
	}
}
