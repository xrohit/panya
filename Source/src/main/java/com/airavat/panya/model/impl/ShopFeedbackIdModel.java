/**
 * 
 */
package com.airavat.panya.model.impl;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.model.IShopFeedbackId;

/**
 * @author prohit
 *
 */
public class ShopFeedbackIdModel implements IShopFeedbackId {

	private long buyerId;
	private long shopId;

	public ShopFeedbackIdModel() {
	}
	
	public ShopFeedbackIdModel(IShopFeedbackId source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedbackId#getBuyerId()
	 */
	@Override
	public long getBuyerId() {
		return buyerId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedbackId#setBuyerId(long)
	 */
	@Override
	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedbackId#getShopId()
	 */
	@Override
	public long getShopId() {
		return shopId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedbackId#setShopId(long)
	 */
	@Override
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

}
