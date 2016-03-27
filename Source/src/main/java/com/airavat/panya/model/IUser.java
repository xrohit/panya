package com.airavat.panya.model;

import java.util.Date;

public interface IUser {

	/**
	 * @return the userId
	 */
	long getUserId();

	/**
	 * @param userId the userId to set
	 */
	void setUserId(long userId);

	/**
	 * @return the createdBy
	 */
	String getCreatedBy();

	/**
	 * @param createdBy the createdBy to set
	 */
	void setCreatedBy(String createdBy);

	/**
	 * @return the firstName
	 */
	String getFirstName();

	/**
	 * @param firstName the firstName to set
	 */
	void setFirstName(String firstName);

	/**
	 * @return the lastName
	 */
	String getLastName();

	/**
	 * @param lastName the lastName to set
	 */
	void setLastName(String lastName);

	/**
	 * @return the mailId
	 */
	String getMailId();

	/**
	 * @param mailId the mailId to set
	 */
	void setMailId(String mailId);

	/**
	 * @return the modifiedBy
	 */
	String getModifiedBy();

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	void setModifiedBy(String modifiedBy);

	/**
	 * @return the password
	 */
	String getPassword();

	/**
	 * @param password the password to set
	 */
	void setPassword(String password);

	/**
	 * @return the type
	 */
	int getType();

	/**
	 * @param type the type to set
	 */
	void setType(int type);

	/**
	 * @return the username
	 */
	String getUsername();

	/**
	 * @param username the username to set
	 */
	void setUsername(String username);

	/**
	 * @return the enabled
	 */
	boolean isEnabled();

	/**
	 * @param enabled the enabled to set
	 */
	void setEnabled(boolean enabled);

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