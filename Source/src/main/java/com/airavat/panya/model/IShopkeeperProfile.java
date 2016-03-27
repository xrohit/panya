package com.airavat.panya.model;

import java.util.Date;

public interface IShopkeeperProfile {

	/**
	 * @return the shopId
	 */
	long getShopId();

	/**
	 * @param shopId the shopId to set
	 */
	void setShopId(long shopId);

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
	 * @return the shopAddress
	 */
	String getShopAddress();

	/**
	 * @param shopAddress the shopAddress to set
	 */
	void setShopAddress(String shopAddress);

	/**
	 * @return the shopCity
	 */
	String getShopCity();

	/**
	 * @param shopCity the shopCity to set
	 */
	void setShopCity(String shopCity);

	/**
	 * @return the shopCloseTime
	 */
	Date getShopCloseTime();

	/**
	 * @param shopCloseTime the shopCloseTime to set
	 */
	void setShopCloseTime(Date shopCloseTime);

	/**
	 * @return the shopCoordinatesLat
	 */
	Double getShopCoordinatesLat();

	/**
	 * @param shopCoordinatesLat the shopCoordinatesLat to set
	 */
	void setShopCoordinatesLat(Double shopCoordinatesLat);

	/**
	 * @return the shopCoordinatesLong
	 */
	Double getShopCoordinatesLong();

	/**
	 * @param shopCoordinatesLong the shopCoordinatesLong to set
	 */
	void setShopCoordinatesLong(Double shopCoordinatesLong);

	/**
	 * @return the shopDesc
	 */
	String getShopDesc();

	/**
	 * @param shopDesc the shopDesc to set
	 */
	void setShopDesc(String shopDesc);

	/**
	 * @return the shopImage
	 */
	String getShopImage();

	/**
	 * @param shopImage the shopImage to set
	 */
	void setShopImage(String shopImage);

	/**
	 * @return the shopOpenTime
	 */
	Date getShopOpenTime();

	/**
	 * @param shopOpenTime the shopOpenTime to set
	 */
	void setShopOpenTime(Date shopOpenTime);

	/**
	 * @return the shopPan
	 */
	String getShopPan();

	/**
	 * @param shopPan the shopPan to set
	 */
	void setShopPan(String shopPan);

	/**
	 * @return the shopPrimaryContact
	 */
	String getShopPrimaryContact();

	/**
	 * @param shopPrimaryContact the shopPrimaryContact to set
	 */
	void setShopPrimaryContact(String shopPrimaryContact);

	/**
	 * @return the shopProductTags
	 */
	String getShopProductTags();

	/**
	 * @param shopProductTags the shopProductTags to set
	 */
	void setShopProductTags(String shopProductTags);

	/**
	 * @return the shopSecondaryContact
	 */
	String getShopSecondaryContact();

	/**
	 * @param shopSecondaryContact the shopSecondaryContact to set
	 */
	void setShopSecondaryContact(String shopSecondaryContact);

	/**
	 * @return the shopState
	 */
	String getShopState();

	/**
	 * @param shopState the shopState to set
	 */
	void setShopState(String shopState);

	/**
	 * @return the shopTin
	 */
	String getShopTin();

	/**
	 * @param shopTin the shopTin to set
	 */
	void setShopTin(String shopTin);

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