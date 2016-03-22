/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.OrderItem;
import com.airavat.panya.db.entities.ShopkeeperProfile;
import com.airavat.panya.model.IOrder;

/**
 * @author prohit
 *
 */
public class Order implements IOrder {

	private long orderId;
	private BuyerProfile buyerProfile;
	private ShopkeeperProfile shopkeeperProfile;
	private String createdBy;
	private String modifiedBy;
	private String oderStatus;
	private long totalPrice;
	private Date createdDate;
	private Date modifiedDate;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

	public Order() {
	}
	
	public Order(IOrder source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getOrderId()
	 */
	@Override
	public long getOrderId() {
		return orderId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setOrderId(long)
	 */
	@Override
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getBuyerProfile()
	 */
	@Override
	public BuyerProfile getBuyerProfile() {
		return buyerProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setBuyerProfile(com.airavat.panya.db.entities.BuyerProfile)
	 */
	@Override
	public void setBuyerProfile(BuyerProfile buyerProfile) {
		this.buyerProfile = buyerProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getShopkeeperProfile()
	 */
	@Override
	public ShopkeeperProfile getShopkeeperProfile() {
		return shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setShopkeeperProfile(com.airavat.panya.db.entities.ShopkeeperProfile)
	 */
	@Override
	public void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile) {
		this.shopkeeperProfile = shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getOderStatus()
	 */
	@Override
	public String getOderStatus() {
		return oderStatus;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setOderStatus(java.lang.String)
	 */
	@Override
	public void setOderStatus(String oderStatus) {
		this.oderStatus = oderStatus;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getTotalPrice()
	 */
	@Override
	public long getTotalPrice() {
		return totalPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setTotalPrice(long)
	 */
	@Override
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#getOrderItems()
	 */
	@Override
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrder#setOrderItems(java.util.Set)
	 */
	@Override
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
