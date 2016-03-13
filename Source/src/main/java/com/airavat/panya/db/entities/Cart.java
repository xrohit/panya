package com.airavat.panya.db.entities;

// default package
// Generated 13 Mar, 2016 12:07:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cart generated by hbm2java
 */
@Entity
@Table(name = "cart", schema = "public")
public class Cart implements java.io.Serializable {

	private CartId id;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;

	public Cart() {
	}

	public Cart(CartId id, Date createdDate, String createdBy, Date modifiedDate) {
		this.id = id;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
	}

	public Cart(CartId id, Date createdDate, String createdBy,
			Date modifiedDate, String modifiedBy) {
		this.id = id;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cartId", column = @Column(name = "cart_id", nullable = false)),
			@AttributeOverride(name = "shopId", column = @Column(name = "shop_id", nullable = false, length = 32)),
			@AttributeOverride(name = "itemId", column = @Column(name = "item_id", nullable = false, length = 32)) })
	public CartId getId() {
		return this.id;
	}

	public void setId(CartId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "created_date", nullable = false, length = 21)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by", nullable = false, length = 32)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "modified_date", nullable = false, length = 21)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "modified_by", length = 32)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
