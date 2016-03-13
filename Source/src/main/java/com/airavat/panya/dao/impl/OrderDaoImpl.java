package com.airavat.panya.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.OrdersDao;
import com.airavat.panya.db.entities.Orders;

@Repository
public class OrderDaoImpl extends PanyaDaoImpl<Orders> implements OrdersDao {

	public OrderDaoImpl() {
		super(Orders.class);
	}
}
