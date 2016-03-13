package com.airavat.panya.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.BuyerProfileDao;
import com.airavat.panya.db.entities.BuyerProfile;

@Repository
public class BuyerProfileDaoImpl extends PanyaDaoImpl<BuyerProfile> implements
		BuyerProfileDao {

	public BuyerProfileDaoImpl() {
		super(BuyerProfile.class);
	}
}
