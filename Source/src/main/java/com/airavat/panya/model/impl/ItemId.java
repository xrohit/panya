/**
 * 
 */
package com.airavat.panya.model.impl;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.model.IItemId;

/**
 * @author prohit
 *
 */
public class ItemId implements IItemId {


	private long itemId;
	private long shopId;

	public ItemId() {
	}
	
	public ItemId(IItemId source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItemId#getItemId()
	 */
	@Override
	public long getItemId() {
		return itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItemId#setItemId(long)
	 */
	@Override
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItemId#getShopId()
	 */
	@Override
	public long getShopId() {
		return shopId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItemId#setShopId(long)
	 */
	@Override
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
}
