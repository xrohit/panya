package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 10:19:08 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderItemId generated by hbm2java
 */
@Embeddable
public class OrderItemId implements java.io.Serializable {

	private long itemId;
	private long oderId;

	public OrderItemId() {
	}

	public OrderItemId(long itemId, long oderId) {
		this.itemId = itemId;
		this.oderId = oderId;
	}

	@Column(name = "item_id", nullable = false)
	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	@Column(name = "oder_id", nullable = false)
	public long getOderId() {
		return this.oderId;
	}

	public void setOderId(long oderId) {
		this.oderId = oderId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderItemId))
			return false;
		OrderItemId castOther = (OrderItemId) other;

		return (this.getItemId() == castOther.getItemId())
				&& (this.getOderId() == castOther.getOderId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemId();
		result = 37 * result + (int) this.getOderId();
		return result;
	}

}
