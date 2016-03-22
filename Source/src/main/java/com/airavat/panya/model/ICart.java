package com.airavat.panya.model;

import java.util.Date;

import com.airavat.panya.db.entities.CartId;
import com.airavat.panya.db.entities.Item;

public interface ICart {

	/**
	 * @return the id
	 */
	CartId getId();

	/**
	 * @param id the id to set
	 */
	void setId(CartId id);

	/**
	 * @return the item
	 */
	Item getItem();

	/**
	 * @param item the item to set
	 */
	void setItem(Item item);

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the modifiedBy
	 */
	String getModifiedBy();

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	void setModifiedBy(String modifiedBy);

	/**
	 * @return the createdDate
	 */
	Date getCreatedDate();

	/**
	 * @param createdDate the createdDate to set
	 */
	void setCreatedDate(Date createdDate);

	/**
	 * @return the modifiedDate
	 */
	Date getModifiedDate();

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	void setModifiedDate(Date modifiedDate);

}