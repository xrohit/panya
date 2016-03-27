/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.OrderItem;
import com.airavat.panya.model.IOrderItem;

/**
 * @author prohit
 *
 */
public class OrderItemModel implements IOrderItem {

	private OrderItemIdModel id;
	private OrderModel orders;
	private String createdBy;
	private long discountedItemPrice;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	public OrderItemModel() {
	}
	
	public OrderItemModel(OrderItem source, boolean recursive) {
		BeanUtils.copyProperties(source, this, "id", "orders");
		this.id = new OrderItemIdModel(source.getId());
		if(recursive) {
			this.orders = new OrderModel(source.getOrders(), false);
		}
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getId()
	 */
	public OrderItemIdModel getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setId(com.airavat.panya.db.entities.OrderItemId)
	 */
	public void setId(OrderItemIdModel id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#getOrders()
	 */
	public OrderModel getOrders() {
		return orders;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItem#setOrders(com.airavat.panya.db.entities.Orders)
	 */
	public void setOrders(OrderModel orders) {
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
