/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.ShopFeedbackId;
import com.airavat.panya.db.entities.ShopkeeperProfile;
import com.airavat.panya.model.IShopFeedback;

/**
 * @author prohit
 *
 */
public class ShopFeedback implements IShopFeedback {

	private ShopFeedbackId id;
	private BuyerProfile buyerProfile;
	private ShopkeeperProfile shopkeeperProfile;
	private String createdBy;
	private String modifiedBy;
	private String shopComments;
	private int shopRatings;
	private Date createdDate;
	private Date modifiedDate;

	public ShopFeedback() {
	}
	
	public ShopFeedback(IShopFeedback source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getId()
	 */
	@Override
	public ShopFeedbackId getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setId(com.airavat.panya.db.entities.ShopFeedbackId)
	 */
	@Override
	public void setId(ShopFeedbackId id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getBuyerProfile()
	 */
	@Override
	public BuyerProfile getBuyerProfile() {
		return buyerProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setBuyerProfile(com.airavat.panya.db.entities.BuyerProfile)
	 */
	@Override
	public void setBuyerProfile(BuyerProfile buyerProfile) {
		this.buyerProfile = buyerProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getShopkeeperProfile()
	 */
	@Override
	public ShopkeeperProfile getShopkeeperProfile() {
		return shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setShopkeeperProfile(com.airavat.panya.db.entities.ShopkeeperProfile)
	 */
	@Override
	public void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile) {
		this.shopkeeperProfile = shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getShopComments()
	 */
	@Override
	public String getShopComments() {
		return shopComments;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setShopComments(java.lang.String)
	 */
	@Override
	public void setShopComments(String shopComments) {
		this.shopComments = shopComments;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getShopRatings()
	 */
	@Override
	public int getShopRatings() {
		return shopRatings;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setShopRatings(int)
	 */
	@Override
	public void setShopRatings(int shopRatings) {
		this.shopRatings = shopRatings;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IShopFeedback#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
