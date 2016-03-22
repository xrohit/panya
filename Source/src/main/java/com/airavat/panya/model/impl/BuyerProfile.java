/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Orders;
import com.airavat.panya.db.entities.ShopFeedback;
import com.airavat.panya.db.entities.Users;
import com.airavat.panya.model.IBuyerProfile;

/**
 * @author prohit
 *
 */
public class BuyerProfile implements IBuyerProfile {

	private long buyerId;
	private Users users;
	private String buyerPrimaryContact;
	private String buyerSecondaryContact;
	private String createdBy;
	private String deliveryAddress;
	private String modifiedBy;
	private String registeredShops;
	private Date createdDate;
	private Date modifiedDate;
	private Set<ShopFeedback> shopFeedbacks = new HashSet<ShopFeedback>(0);
	private Set<Orders> orderses = new HashSet<Orders>(0);
	
	public BuyerProfile() {
		
	}
	
	public BuyerProfile(IBuyerProfile source) {
		
		BeanUtils.copyProperties(source, this);
	}
	
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getBuyerId()
	 */
	@Override
	public long getBuyerId() {
		return buyerId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setBuyerId(long)
	 */
	@Override
	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getUsers()
	 */
	@Override
	public Users getUsers() {
		return users;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setUsers(com.airavat.panya.db.entities.Users)
	 */
	@Override
	public void setUsers(Users users) {
		this.users = users;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getBuyerPrimaryContact()
	 */
	@Override
	public String getBuyerPrimaryContact() {
		return buyerPrimaryContact;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setBuyerPrimaryContact(java.lang.String)
	 */
	@Override
	public void setBuyerPrimaryContact(String buyerPrimaryContact) {
		this.buyerPrimaryContact = buyerPrimaryContact;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getBuyerSecondaryContact()
	 */
	@Override
	public String getBuyerSecondaryContact() {
		return buyerSecondaryContact;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setBuyerSecondaryContact(java.lang.String)
	 */
	@Override
	public void setBuyerSecondaryContact(String buyerSecondaryContact) {
		this.buyerSecondaryContact = buyerSecondaryContact;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getDeliveryAddress()
	 */
	@Override
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setDeliveryAddress(java.lang.String)
	 */
	@Override
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getRegisteredShops()
	 */
	@Override
	public String getRegisteredShops() {
		return registeredShops;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setRegisteredShops(java.lang.String)
	 */
	@Override
	public void setRegisteredShops(String registeredShops) {
		this.registeredShops = registeredShops;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getShopFeedbacks()
	 */
	@Override
	public Set<ShopFeedback> getShopFeedbacks() {
		return shopFeedbacks;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setShopFeedbacks(java.util.Set)
	 */
	@Override
	public void setShopFeedbacks(Set<ShopFeedback> shopFeedbacks) {
		this.shopFeedbacks = shopFeedbacks;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getOrderses()
	 */
	@Override
	public Set<Orders> getOrderses() {
		return orderses;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setOrderses(java.util.Set)
	 */
	@Override
	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}
}
