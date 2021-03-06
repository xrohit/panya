package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 10:19:08 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.airavat.panya.model.IOrder;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", schema = "public")
public class Orders implements java.io.Serializable, IOrder {

	private long orderId;
	private BuyerProfile buyerProfile;
	private ShopkeeperProfile shopkeeperProfile;
	private String createdBy;
	private String modifiedBy;
	private String oderStatus;
	private long totalPrice;
	private Date createdDate;
	private Date modifiedDate;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

	public Orders() {
	}

	public Orders(long orderId, BuyerProfile buyerProfile,
			ShopkeeperProfile shopkeeperProfile, String createdBy,
			String oderStatus, long totalPrice, Date createdDate) {
		this.orderId = orderId;
		this.buyerProfile = buyerProfile;
		this.shopkeeperProfile = shopkeeperProfile;
		this.createdBy = createdBy;
		this.oderStatus = oderStatus;
		this.totalPrice = totalPrice;
		this.createdDate = createdDate;
	}

	public Orders(long orderId, BuyerProfile buyerProfile,
			ShopkeeperProfile shopkeeperProfile, String createdBy,
			String modifiedBy, String oderStatus, long totalPrice,
			Date createdDate, Date modifiedDate, Set<OrderItem> orderItems) {
		this.orderId = orderId;
		this.buyerProfile = buyerProfile;
		this.shopkeeperProfile = shopkeeperProfile;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.oderStatus = oderStatus;
		this.totalPrice = totalPrice;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.orderItems = orderItems;
	}

	@Id
	@Column(name = "order_id", unique = true, nullable = false)
	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buyer_id", nullable = false)
	public BuyerProfile getBuyerProfile() {
		return this.buyerProfile;
	}

	public void setBuyerProfile(BuyerProfile buyerProfile) {
		this.buyerProfile = buyerProfile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id", nullable = false)
	public ShopkeeperProfile getShopkeeperProfile() {
		return this.shopkeeperProfile;
	}

	public void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile) {
		this.shopkeeperProfile = shopkeeperProfile;
	}

	@Column(name = "created_by", nullable = false, length = 32)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "modified_by", length = 32)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "oder_status", nullable = false, length = 32)
	public String getOderStatus() {
		return this.oderStatus;
	}

	public void setOderStatus(String oderStatus) {
		this.oderStatus = oderStatus;
	}

	@Column(name = "total_price", nullable = false)
	public long getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date", length = 29)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
