/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.Orders;
import com.airavat.panya.db.entities.ShopFeedback;
import com.airavat.panya.db.entities.Users;
import com.airavat.panya.model.IBuyerProfile;

/**
 * @author prohit
 *
 */
public class BuyerProfileModel implements IBuyerProfile {

	private long buyerId;
	private UserModel users;
	private String buyerPrimaryContact;
	private String buyerSecondaryContact;
	private String createdBy;
	private String deliveryAddress;
	private String modifiedBy;
	private String registeredShops;
	private Date createdDate;
	private Date modifiedDate;
	private Set<ShopFeedbackModel> shopFeedbacks = new HashSet<ShopFeedbackModel>(0);
	private Set<OrderModel> orderses = new HashSet<OrderModel>(0);
	
	public BuyerProfileModel() {
		
	}
	public BuyerProfileModel(Users users) {
		
		BuyerProfile source = users.getBuyerProfile();
		
		BeanUtils.copyProperties(source, this, "users", "shopFeedbacks", "orderses");
		for(ShopFeedback fb : source.getShopFeedbacks()) {
			this.shopFeedbacks.add(new ShopFeedbackModel(fb, false));
		}
		for(Orders o : source.getOrderses()) {
			this.orderses.add(new OrderModel(o, false));
		}
	}
	
	public BuyerProfileModel(BuyerProfile source, boolean recursive) {
		
		BeanUtils.copyProperties(source, this, "users", "shopFeedbacks", "orderses");
		
		if(recursive) {
			this.users = new UserModel(source.getUsers(), false);
		}
		
		for(ShopFeedback fb : source.getShopFeedbacks()) {
			this.shopFeedbacks.add(new ShopFeedbackModel(fb, false));
		}
		for(Orders o : source.getOrderses()) {
			this.orderses.add(new OrderModel(o, false));
		}
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
	public UserModel getUsers() {
		return users;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setUsers(com.airavat.panya.db.entities.Users)
	 */
	public void setUsers(UserModel users) {
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
	public Set<ShopFeedbackModel> getShopFeedbacks() {
		return shopFeedbacks;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setShopFeedbacks(java.util.Set)
	 */
	public void setShopFeedbacks(Set<ShopFeedbackModel> shopFeedbacks) {
		this.shopFeedbacks = shopFeedbacks;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#getOrderses()
	 */
	public Set<OrderModel> getOrderses() {
		return orderses;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IBuyerProfile#setOrderses(java.util.Set)
	 */
	public void setOrderses(Set<OrderModel> orderses) {
		this.orderses = orderses;
	}
}
