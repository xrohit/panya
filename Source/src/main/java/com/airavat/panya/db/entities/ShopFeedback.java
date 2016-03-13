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
 * ShopFeedback generated by hbm2java
 */
@Entity
@Table(name = "shop_feedback", schema = "public")
public class ShopFeedback implements java.io.Serializable {

	private ShopFeedbackId id;
	private int shopRatings;
	private String shopComments;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;

	public ShopFeedback() {
	}

	public ShopFeedback(ShopFeedbackId id, int shopRatings, Date createdDate,
			String createdBy, Date modifiedDate) {
		this.id = id;
		this.shopRatings = shopRatings;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
	}

	public ShopFeedback(ShopFeedbackId id, int shopRatings,
			String shopComments, Date createdDate, String createdBy,
			Date modifiedDate, String modifiedBy) {
		this.id = id;
		this.shopRatings = shopRatings;
		this.shopComments = shopComments;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "shopId", column = @Column(name = "shop_id", nullable = false)),
			@AttributeOverride(name = "buyerId", column = @Column(name = "buyer_id", nullable = false)) })
	public ShopFeedbackId getId() {
		return this.id;
	}

	public void setId(ShopFeedbackId id) {
		this.id = id;
	}

	@Column(name = "shop_ratings", nullable = false)
	public int getShopRatings() {
		return this.shopRatings;
	}

	public void setShopRatings(int shopRatings) {
		this.shopRatings = shopRatings;
	}

	@Column(name = "shop_comments", length = 1024)
	public String getShopComments() {
		return this.shopComments;
	}

	public void setShopComments(String shopComments) {
		this.shopComments = shopComments;
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