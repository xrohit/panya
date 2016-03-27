/**
 * 
 */
package com.airavat.panya.model.impl;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.model.IOrderItemId;

/**
 * @author prohit
 *
 */
public class OrderItemIdModel implements IOrderItemId {

	private long itemId;
	private long oderId;

	public OrderItemIdModel() {
	}
	
	public OrderItemIdModel(IOrderItemId source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItemId#getItemId()
	 */
	@Override
	public long getItemId() {
		return itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItemId#setItemId(long)
	 */
	@Override
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItemId#getOderId()
	 */
	@Override
	public long getOderId() {
		return oderId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IOrderItemId#setOderId(long)
	 */
	@Override
	public void setOderId(long oderId) {
		this.oderId = oderId;
	}

}
