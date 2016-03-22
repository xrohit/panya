package com.airavat.panya.model;

import java.util.Date;

import com.airavat.panya.db.entities.OrderItemId;
import com.airavat.panya.db.entities.Orders;

public interface IOrderItem {

	/**
	 * @return the id
	 */
	OrderItemId getId();

	/**
	 * @param id the id to set
	 */
	void setId(OrderItemId id);

	/**
	 * @return the orders
	 */
	Orders getOrders();

	/**
	 * @param orders the orders to set
	 */
	void setOrders(Orders orders);

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the discountedItemPrice
	 */
	long getDiscountedItemPrice();

	/**
	 * @param discountedItemPrice the discountedItemPrice to set
	 */
	void setDiscountedItemPrice(long discountedItemPrice);

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