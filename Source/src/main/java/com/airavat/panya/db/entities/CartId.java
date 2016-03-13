package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 12:07:23 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CartId generated by hbm2java
 */
@Embeddable
public class CartId implements java.io.Serializable {

	private long cartId;
	private String shopId;
	private String itemId;

	public CartId() {
	}

	public CartId(long cartId, String shopId, String itemId) {
		this.cartId = cartId;
		this.shopId = shopId;
		this.itemId = itemId;
	}

	@Column(name = "cart_id", nullable = false)
	public long getCartId() {
		return this.cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	@Column(name = "shop_id", nullable = false, length = 32)
	public String getShopId() {
		return this.shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Column(name = "item_id", nullable = false, length = 32)
	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
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
				&& ((this.getShopId() == castOther.getShopId()) || (this
						.getShopId() != null && castOther.getShopId() != null && this
						.getShopId().equals(castOther.getShopId())))
				&& ((this.getItemId() == castOther.getItemId()) || (this
						.getItemId() != null && castOther.getItemId() != null && this
						.getItemId().equals(castOther.getItemId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCartId();
		result = 37 * result
				+ (getShopId() == null ? 0 : this.getShopId().hashCode());
		result = 37 * result
				+ (getItemId() == null ? 0 : this.getItemId().hashCode());
		return result;
	}

}