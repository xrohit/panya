package com.airavat.panya.model;

import java.util.Date;
import java.util.Set;

import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.OrderItem;
import com.airavat.panya.db.entities.ShopkeeperProfile;

public interface IOrder {

	/**
	 * @return the orderId
	 */
	long getOrderId();

	/**
	 * @param orderId the orderId to set
	 */
	void setOrderId(long orderId);

	/**
	 * @return the buyerProfile
	 */
	BuyerProfile getBuyerProfile();

	/**
	 * @param buyerProfile the buyerProfile to set
	 */
	void setBuyerProfile(BuyerProfile buyerProfile);

	/**
	 * @return the shopkeeperProfile
	 */
	ShopkeeperProfile getShopkeeperProfile();

	/**
	 * @param shopkeeperProfile the shopkeeperProfile to set
	 */
	void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile);

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
	 * @return the oderStatus
	 */
	String getOderStatus();

	/**
	 * @param oderStatus the oderStatus to set
	 */
	void setOderStatus(String oderStatus);

	/**
	 * @return the totalPrice
	 */
	long getTotalPrice();

	/**
	 * @param totalPrice the totalPrice to set
	 */
	void setTotalPrice(long totalPrice);

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

	/**
	 * @return the orderItems
	 */
	Set<OrderItem> getOrderItems();

	/**
	 * @param orderItems the orderItems to set
	 */
	void setOrderItems(Set<OrderItem> orderItems);

}