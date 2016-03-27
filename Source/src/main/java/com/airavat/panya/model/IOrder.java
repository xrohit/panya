package com.airavat.panya.model;

import java.util.Date;

public interface IOrder {

	/**
	 * @return the orderId
	 */
	long getOrderId();

	/**
	 * @param orderId the orderId to set
	 */
	void setOrderId(long orderId);

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
	 * @return the oderStatus
	 */
	String getOderStatus();

	/**
	 * @param oderStatus the oderStatus to set
	 */
	void setOderStatus(String oderStatus);

	/**
	 * @return the totalPrice
	 */
	long getTotalPrice();

	/**
	 * @param totalPrice the totalPrice to set
	 */
	void setTotalPrice(long totalPrice);

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