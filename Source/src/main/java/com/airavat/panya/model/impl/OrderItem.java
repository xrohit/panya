/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.OrderItemId;
import com.airavat.panya.db.entities.Orders;
import com.airavat.panya.model.IOrderItem;

/**
 * @author prohit
 *
 */
public class OrderItem implements IOrderItem {

	private OrderItemId id;
	private Orders orders;
	private String createdBy;
	private long discountedItemPrice;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	public OrderItem() {
	}
	
	public OrderItem(IOrderItem source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getId()
	 */
	@Override
	public OrderItemId getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setId(com.airavat.panya.db.entities.OrderItemId)
	 */
	@Override
	public void setId(OrderItemId id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getOrders()
	 */
	@Override
	public Orders getOrders() {
		return orders;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setOrders(com.airavat.panya.db.entities.Orders)
	 */
	@Override
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getDiscountedItemPrice()
	 */
	@Override
	public long getDiscountedItemPrice() {
		return discountedItemPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setDiscountedItemPrice(long)
	 */
	@Override
	public void setDiscountedItemPrice(long discountedItemPrice) {
		this.discountedItemPrice = discountedItemPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
