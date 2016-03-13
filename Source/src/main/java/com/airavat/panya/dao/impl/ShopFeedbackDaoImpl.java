package com.airavat.panya.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.ShopFeedbackDao;
import com.airavat.panya.db.entities.ShopFeedback;

@Repository
public class ShopFeedbackDaoImpl extends PanyaDaoImpl<ShopFeedback> implements
		ShopFeedbackDao {

	public ShopFeedbackDaoImpl() {
		super(ShopFeedback.class);
	}
}
