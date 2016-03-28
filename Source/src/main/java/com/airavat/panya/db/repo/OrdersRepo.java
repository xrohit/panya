package com.airavat.panya.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.Orders;

public interface OrdersRepo extends CrudRepository<Orders, Long> {

}
