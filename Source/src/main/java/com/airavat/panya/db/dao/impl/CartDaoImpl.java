package com.airavat.panya.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.CartDao;
import com.airavat.panya.db.entities.Cart;

@Repository
public class CartDaoImpl extends PanyaDaoImpl<Cart> implements CartDao {

	public CartDaoImpl() {
		super(Cart.class);
	}
}
