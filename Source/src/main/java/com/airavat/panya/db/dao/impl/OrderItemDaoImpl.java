package com.airavat.panya.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.OrderItemDao;
import com.airavat.panya.db.entities.OrderItem;

@Repository
public class OrderItemDaoImpl extends PanyaDaoImpl<OrderItem> implements
		OrderItemDao {

	public OrderItemDaoImpl() {
		super(OrderItem.class);
	}
}
