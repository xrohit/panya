/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Item;
import com.airavat.panya.db.entities.Orders;
import com.airavat.panya.db.entities.ShopFeedback;
import com.airavat.panya.db.entities.ShopkeeperProfile;
import com.airavat.panya.model.IShopkeeperProfile;

/**
 * @author prohit
 *
 */
public class ShopkeeperProfileModel implements IShopkeeperProfile {


	private long shopId;
	private UserModel users;
	private String createdBy;
	private String modifiedBy;
	private String shopAddress;
	private String shopCity;
	private Date shopCloseTime;
	private Double shopCoordinatesLat;
	private Double shopCoordinatesLong;
	private String shopDesc;
	private String shopImage;
	private Date shopOpenTime;
	private String shopPan;
	private String shopPrimaryContact;
	private String shopProductTags;
	private String shopSecondaryContact;
	private String shopState;
	private String shopTin;
	private Date createdDate;
	private Date modifiedDate;
	private Set<OrderModel> orderses = new HashSet<OrderModel>(0);
	private Set<ItemModel> items = new HashSet<ItemModel>(0);
	private Set<ShopFeedbackModel> shopFeedbacks = new HashSet<ShopFeedbackModel>(0);

	public ShopkeeperProfileModel() {
	}
	
	public ShopkeeperProfileModel(ShopkeeperProfile source, boolean recursive) {
		BeanUtils.copyProperties(source, this, "users", "orderses", "items", "shopFeedbacks");
		
		if(recursive) {
			this.users = new UserModel(source.getUsers(), false);
		}
		
		for(Orders o : source.getOrderses()) {
			this.orderses.add(new OrderModel(o, false));
		}
		for(Item i : source.getItems()) {
			this.items.add(new ItemModel(i, false));
		}
		for(ShopFeedback fb : source.getShopFeedbacks()) {
			this.shopFeedbacks.add(new ShopFeedbackModel(fb, false));
		}
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopId()
	 */
	@Override
	public long getShopId() {
		return shopId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopId(long)
	 */
	@Override
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getUsers()
	 */
	public UserModel getUsers() {
		return users;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setUsers(com.airavat.panya.db.entities.Users)
	 */
	public void setUsers(UserModel users) {
		this.users = users;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopAddress()
	 */
	@Override
	public String getShopAddress() {
		return shopAddress;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopAddress(java.lang.String)
	 */
	@Override
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopCity()
	 */
	@Override
	public String getShopCity() {
		return shopCity;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopCity(java.lang.String)
	 */
	@Override
	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopCloseTime()
	 */
	@Override
	public Date getShopCloseTime() {
		return shopCloseTime;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopCloseTime(java.util.Date)
	 */
	@Override
	public void setShopCloseTime(Date shopCloseTime) {
		this.shopCloseTime = shopCloseTime;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopCoordinatesLat()
	 */
	@Override
	public Double getShopCoordinatesLat() {
		return shopCoordinatesLat;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopCoordinatesLat(java.lang.Double)
	 */
	@Override
	public void setShopCoordinatesLat(Double shopCoordinatesLat) {
		this.shopCoordinatesLat = shopCoordinatesLat;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopCoordinatesLong()
	 */
	@Override
	public Double getShopCoordinatesLong() {
		return shopCoordinatesLong;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopCoordinatesLong(java.lang.Double)
	 */
	@Override
	public void setShopCoordinatesLong(Double shopCoordinatesLong) {
		this.shopCoordinatesLong = shopCoordinatesLong;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopDesc()
	 */
	@Override
	public String getShopDesc() {
		return shopDesc;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopDesc(java.lang.String)
	 */
	@Override
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopImage()
	 */
	@Override
	public String getShopImage() {
		return shopImage;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopImage(java.lang.String)
	 */
	@Override
	public void setShopImage(String shopImage) {
		this.shopImage = shopImage;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopOpenTime()
	 */
	@Override
	public Date getShopOpenTime() {
		return shopOpenTime;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopOpenTime(java.util.Date)
	 */
	@Override
	public void setShopOpenTime(Date shopOpenTime) {
		this.shopOpenTime = shopOpenTime;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopPan()
	 */
	@Override
	public String getShopPan() {
		return shopPan;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopPan(java.lang.String)
	 */
	@Override
	public void setShopPan(String shopPan) {
		this.shopPan = shopPan;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopPrimaryContact()
	 */
	@Override
	public String getShopPrimaryContact() {
		return shopPrimaryContact;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopPrimaryContact(java.lang.String)
	 */
	@Override
	public void setShopPrimaryContact(String shopPrimaryContact) {
		this.shopPrimaryContact = shopPrimaryContact;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopProductTags()
	 */
	@Override
	public String getShopProductTags() {
		return shopProductTags;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopProductTags(java.lang.String)
	 */
	@Override
	public void setShopProductTags(String shopProductTags) {
		this.shopProductTags = shopProductTags;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopSecondaryContact()
	 */
	@Override
	public String getShopSecondaryContact() {
		return shopSecondaryContact;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopSecondaryContact(java.lang.String)
	 */
	@Override
	public void setShopSecondaryContact(String shopSecondaryContact) {
		this.shopSecondaryContact = shopSecondaryContact;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopState()
	 */
	@Override
	public String getShopState() {
		return shopState;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopState(java.lang.String)
	 */
	@Override
	public void setShopState(String shopState) {
		this.shopState = shopState;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopTin()
	 */
	@Override
	public String getShopTin() {
		return shopTin;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopTin(java.lang.String)
	 */
	@Override
	public void setShopTin(String shopTin) {
		this.shopTin = shopTin;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getOrderses()
	 */
	public Set<OrderModel> getOrderses() {
		return orderses;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setOrderses(java.util.Set)
	 */
	public void setOrderses(Set<OrderModel> orderses) {
		this.orderses = orderses;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getItems()
	 */
	public Set<ItemModel> getItems() {
		return items;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setItems(java.util.Set)
	 */
	public void setItems(Set<ItemModel> items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#getShopFeedbacks()
	 */
	public Set<ShopFeedbackModel> getShopFeedbacks() {
		return shopFeedbacks;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopkeeperProfile#setShopFeedbacks(java.util.Set)
	 */
	public void setShopFeedbacks(Set<ShopFeedbackModel> shopFeedbacks) {
		this.shopFeedbacks = shopFeedbacks;
	}
	
}
