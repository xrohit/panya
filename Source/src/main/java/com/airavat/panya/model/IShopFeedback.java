package com.airavat.panya.model;

import java.util.Date;

import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.ShopFeedbackId;
import com.airavat.panya.db.entities.ShopkeeperProfile;

public interface IShopFeedback {

	/**
	 * @return the id
	 */
	ShopFeedbackId getId();

	/**
	 * @param id the id to set
	 */
	void setId(ShopFeedbackId id);

	/**
	 * @return the buyerProfile
	 */
	BuyerProfile getBuyerProfile();

	/**
	 * @param buyerProfile the buyerProfile to set
	 */
	void setBuyerProfile(BuyerProfile buyerProfile);

	/**
	 * @return the shopkeeperProfile
	 */
	ShopkeeperProfile getShopkeeperProfile();

	/**
	 * @param shopkeeperProfile the shopkeeperProfile to set
	 */
	void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile);

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the modifiedBy
	 */
	String getModifiedBy();

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	void setModifiedBy(String modifiedBy);

	/**
	 * @return the shopComments
	 */
	String getShopComments();

	/**
	 * @param shopComments the shopComments to set
	 */
	void setShopComments(String shopComments);

	/**
	 * @return the shopRatings
	 */
	int getShopRatings();

	/**
	 * @param shopRatings the shopRatings to set
	 */
	void setShopRatings(int shopRatings);

	/**
	 * @return the createdDate
	 */
	Date getCreatedDate();

	/**
	 * @param createdDate the createdDate to set
	 */
	void setCreatedDate(Date createdDate);

	/**
	 * @return the modifiedDate
	 */
	Date getModifiedDate();

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	void setModifiedDate(Date modifiedDate);

}