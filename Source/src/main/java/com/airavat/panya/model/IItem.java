package com.airavat.panya.model;

import java.util.Date;

public interface IItem {

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the itemBrand
	 */
	String getItemBrand();

	/**
	 * @param itemBrand the itemBrand to set
	 */
	void setItemBrand(String itemBrand);

	/**
	 * @return the itemDesc
	 */
	String getItemDesc();

	/**
	 * @param itemDesc the itemDesc to set
	 */
	void setItemDesc(String itemDesc);

	/**
	 * @return the itemName
	 */
	String getItemName();

	/**
	 * @param itemName the itemName to set
	 */
	void setItemName(String itemName);

	/**
	 * @return the itemPrice
	 */
	int getItemPrice();

	/**
	 * @param itemPrice the itemPrice to set
	 */
	void setItemPrice(int itemPrice);

	/**
	 * @return the itemUnit
	 */
	String getItemUnit();

	/**
	 * @param itemUnit the itemUnit to set
	 */
	void setItemUnit(String itemUnit);

	/**
	 * @return the modifiedBy
	 */
	String getModifiedBy();

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	void setModifiedBy(String modifiedBy);

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