package com.airavat.panya.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.Cart;
import com.airavat.panya.db.entities.CartId;

public interface CartRepo extends CrudRepository<Cart, CartId> {

}
