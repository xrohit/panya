/**
 * 
 */
package com.airavat.panya.model.impl;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.model.ICartId;

/**
 * @author prohit
 *
 */
public class CartIdModel implements ICartId {

	private long cartId;
	private long itemId;
	private long shopId;

	public CartIdModel() {
	}

	public CartIdModel(ICartId source) {
		BeanUtils.copyProperties(source, this);
	}
	
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#getCartId()
	 */
	@Override
	public long getCartId() {
		return cartId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#setCartId(long)
	 */
	@Override
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#getItemId()
	 */
	@Override
	public long getItemId() {
		return itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#setItemId(long)
	 */
	@Override
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#getShopId()
	 */
	@Override
	public long getShopId() {
		return shopId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.ICartId#setShopId(long)
	 */
	@Override
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	
}
