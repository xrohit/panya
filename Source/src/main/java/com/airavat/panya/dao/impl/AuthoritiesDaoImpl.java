package com.airavat.panya.dao.impl;

import com.airavat.panya.db.dao.AuthoritiesDao;
import com.airavat.panya.db.entities.Authorities;

public class AuthoritiesDaoImpl extends PanyaDaoImpl<Authorities> implements
		AuthoritiesDao {

	public AuthoritiesDaoImpl() {
		super(Authorities.class);
	}
}
