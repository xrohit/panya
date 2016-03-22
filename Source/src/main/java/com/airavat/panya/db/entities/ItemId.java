package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 10:19:08 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.airavat.panya.model.IItemId;

/**
 * ItemId generated by hbm2java
 */
@Embeddable
public class ItemId implements java.io.Serializable, IItemId {

	private long itemId;
	private long shopId;

	public ItemId() {
	}

	public ItemId(long itemId, long shopId) {
		this.itemId = itemId;
		this.shopId = shopId;
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
		if (!(other instanceof ItemId))
			return false;
		ItemId castOther = (ItemId) other;

		return (this.getItemId() == castOther.getItemId())
				&& (this.getShopId() == castOther.getShopId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemId();
		result = 37 * result + (int) this.getShopId();
		return result;
	}

}
