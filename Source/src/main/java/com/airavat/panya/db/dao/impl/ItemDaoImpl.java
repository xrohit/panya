package com.airavat.panya.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.ItemDao;
import com.airavat.panya.db.entities.Item;

@Repository
public class ItemDaoImpl extends PanyaDaoImpl<Item> implements ItemDao {

	public ItemDaoImpl() {
		super(Item.class);
	}
}
