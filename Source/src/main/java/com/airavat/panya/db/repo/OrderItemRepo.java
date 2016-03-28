package com.airavat.panya.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.OrderItem;
import com.airavat.panya.db.entities.OrderItemId;

public interface OrderItemRepo extends CrudRepository<OrderItem, OrderItemId> {

}
