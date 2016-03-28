package com.airavat.panya.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.airavat.panya.db.entities.ShopFeedback;
import com.airavat.panya.db.entities.ShopFeedbackId;

public interface ShopFeedbackRepo extends CrudRepository<ShopFeedback, ShopFeedbackId> {

}
