package com.airavat.panya.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.DiscountDao;
import com.airavat.panya.db.entities.Discount;

@Repository
public class DiscountDaoImpl extends PanyaDaoImpl<Discount> implements
		DiscountDao {

	public DiscountDaoImpl() {
		super(Discount.class);
	}
}
