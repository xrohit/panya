package com.airavat.panya.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.Item;
import com.airavat.panya.db.entities.ItemId;

public interface ItemRepo extends CrudRepository<Item, ItemId> {

}
