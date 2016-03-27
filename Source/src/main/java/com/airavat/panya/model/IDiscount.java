package com.airavat.panya.model;

import java.util.Date;

public interface IDiscount {

	/**
	 * @return the discountId
	 */
	long getDiscountId();

	/**
	 * @param discountId the discountId to set
	 */
	void setDiscountId(long discountId);

	/**
	 * @return the discount
	 */
	int getDiscount();

	/**
	 * @param discount the discount to set
	 */
	void setDiscount(int discount);

	/**
	 * @return the discountExpiry
	 */
	Date getDiscountExpiry();

	/**
	 * @param discountExpiry the discountExpiry to set
	 */
	void setDiscountExpiry(Date discountExpiry);

	/**
	 * @return the discountName
	 */
	String getDiscountName();

	/**
	 * @param discountName the discountName to set
	 */
	void setDiscountName(String discountName);

	/**
	 * @return the discountStart
	 */
	Date getDiscountStart();

	/**
	 * @param discountStart the discountStart to set
	 */
	void setDiscountStart(Date discountStart);

	/**
	 * @return the discountType
	 */
	int getDiscountType();

	/**
	 * @param discountType the discountType to set
	 */
	void setDiscountType(int discountType);

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