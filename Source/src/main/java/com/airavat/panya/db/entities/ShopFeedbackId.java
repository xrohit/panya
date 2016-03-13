package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 12:07:23 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ShopFeedbackId generated by hbm2java
 */
@Embeddable
public class ShopFeedbackId implements java.io.Serializable {

	private long shopId;
	private long buyerId;

	public ShopFeedbackId() {
	}

	public ShopFeedbackId(long shopId, long buyerId) {
		this.shopId = shopId;
		this.buyerId = buyerId;
	}

	@Column(name = "shop_id", nullable = false)
	public long getShopId() {
		return this.shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	@Column(name = "buyer_id", nullable = false)
	public long getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShopFeedbackId))
			return false;
		ShopFeedbackId castOther = (ShopFeedbackId) other;

		return (this.getShopId() == castOther.getShopId())
				&& (this.getBuyerId() == castOther.getBuyerId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getShopId();
		result = 37 * result + (int) this.getBuyerId();
		return result;
	}

}