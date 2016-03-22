/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Authorities;
import com.airavat.panya.db.entities.BuyerProfile;
import com.airavat.panya.db.entities.ShopkeeperProfile;
import com.airavat.panya.model.IUser;

/**
 * @author prohit
 *
 */
public class User implements IUser {

	private long userId;
	private String createdBy;
	private String firstName;
	private String lastName;
	private String mailId;
	private String modifiedBy;
	private String password;
	private int type;
	private String username;
	private boolean enabled;
	private Date createdDate;
	private Date modifiedDate;
	private Set<Authorities> authoritieses = new HashSet<Authorities>(0);
	private BuyerProfile buyerProfile;
	private ShopkeeperProfile shopkeeperProfile;

	public User() {		
	}
	
	public User(IUser source) {
		
		BeanUtils.copyProperties(source, this, "authoritieses");
	}
	
	
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getUserId()
	 */
	@Override
	public long getUserId() {
		return userId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setUserId(long)
	 */
	@Override
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getMailId()
	 */
	@Override
	public String getMailId() {
		return mailId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setMailId(java.lang.String)
	 */
	@Override
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getType()
	 */
	@Override
	public int getType() {
		return type;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setType(int)
	 */
	@Override
	public void setType(int type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getUsername()
	 */
	@Override
	public String getUsername() {
		return username;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setUsername(java.lang.String)
	 */
	@Override
	public void setUsername(String username) {
		this.username = username;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getAuthoritieses()
	 */
	@Override
	public Set<Authorities> getAuthoritieses() {
		return authoritieses;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setAuthoritieses(java.util.Set)
	 */
	@Override
	public void setAuthoritieses(Set<Authorities> authoritieses) {
		this.authoritieses = authoritieses;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getBuyerProfile()
	 */
	@Override
	public BuyerProfile getBuyerProfile() {
		return buyerProfile;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setBuyerProfile(com.airavat.panya.db.entities.BuyerProfile)
	 */
	@Override
	public void setBuyerProfile(BuyerProfile buyerProfile) {
		this.buyerProfile = buyerProfile;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#getShopkeeperProfile()
	 */
	@Override
	public ShopkeeperProfile getShopkeeperProfile() {
		return shopkeeperProfile;
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.IUser#setShopkeeperProfile(com.airavat.panya.db.entities.ShopkeeperProfile)
	 */
	@Override
	public void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile) {
		this.shopkeeperProfile = shopkeeperProfile;
	}
}
