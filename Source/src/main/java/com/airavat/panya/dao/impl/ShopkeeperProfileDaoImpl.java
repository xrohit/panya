package com.airavat.panya.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.ShopkeeperProfileDao;
import com.airavat.panya.db.entities.ShopkeeperProfile;

@Repository
public class ShopkeeperProfileDaoImpl extends PanyaDaoImpl<ShopkeeperProfile>
		implements ShopkeeperProfileDao {

	public ShopkeeperProfileDaoImpl() {
		super(ShopkeeperProfile.class);
	}

}
