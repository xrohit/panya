package com.airavat.panya.model;

import java.util.Date;
import java.util.Set;

import com.airavat.panya.db.entities.Orders;
import com.airavat.panya.db.entities.ShopFeedback;
import com.airavat.panya.db.entities.Users;

public interface IBuyerProfile {

	/**
	 * @return the buyerId
	 */
	long getBuyerId();

	/**
	 * @param buyerId the buyerId to set
	 */
	void setBuyerId(long buyerId);

	/**
	 * @return the users
	 */
	Users getUsers();

	/**
	 * @param users the users to set
	 */
	void setUsers(Users users);

	/**
	 * @return the buyerPrimaryContact
	 */
	String getBuyerPrimaryContact();

	/**
	 * @param buyerPrimaryContact the buyerPrimaryContact to set
	 */
	void setBuyerPrimaryContact(String buyerPrimaryContact);

	/**
	 * @return the buyerSecondaryContact
	 */
	String getBuyerSecondaryContact();

	/**
	 * @param buyerSecondaryContact the buyerSecondaryContact to set
	 */
	void setBuyerSecondaryContact(String buyerSecondaryContact);

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the deliveryAddress
	 */
	String getDeliveryAddress();

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	void setDeliveryAddress(String deliveryAddress);

	/**
	 * @return the modifiedBy
	 */
	String getModifiedBy();

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	void setModifiedBy(String modifiedBy);

	/**
	 * @return the registeredShops
	 */
	String getRegisteredShops();

	/**
	 * @param registeredShops the registeredShops to set
	 */
	void setRegisteredShops(String registeredShops);

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
	 * @return the shopFeedbacks
	 */
	Set<ShopFeedback> getShopFeedbacks();

	/**
	 * @param shopFeedbacks the shopFeedbacks to set
	 */
	void setShopFeedbacks(Set<ShopFeedback> shopFeedbacks);

	/**
	 * @return the orderses
	 */
	Set<Orders> getOrderses();

	/**
	 * @param orderses the orderses to set
	 */
	void setOrderses(Set<Orders> orderses);

}