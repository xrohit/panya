package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 10:19:08 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CartId generated by hbm2java
 */
@Embeddable
public class CartId implements java.io.Serializable {

	private long cartId;
	private long itemId;
	private long shopId;

	public CartId() {
	}

	public CartId(long cartId, long itemId, long shopId) {
		this.cartId = cartId;
		this.itemId = itemId;
		this.shopId = shopId;
	}

	@Column(name = "cart_id", nullable = false)
	public long getCartId() {
		return this.cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	@Column(name = "item_id", nullable = false)
	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	@Column(name = "shop_id", nullable = false)
	public long getShopId() {
		return this.shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CartId))
			return false;
		CartId castOther = (CartId) other;

		return (this.getCartId() == castOther.getCartId())
				&& (this.getItemId() == castOther.getItemId())
				&& (this.getShopId() == castOther.getShopId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCartId();
		result = 37 * result + (int) this.getItemId();
		result = 37 * result + (int) this.getShopId();
		return result;
	}

}
