/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Cart;
import com.airavat.panya.db.entities.Discount;
import com.airavat.panya.db.entities.ItemId;
import com.airavat.panya.db.entities.ShopkeeperProfile;
import com.airavat.panya.model.IItem;

/**
 * @author prohit
 *
 */
public class Item implements IItem {

	private ItemId id;
	private Discount discount;
	private ShopkeeperProfile shopkeeperProfile;
	private String createdBy;
	private String itemBrand;
	private String itemDesc;
	private String itemName;
	private int itemPrice;
	private String itemUnit;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;
	private Set<Cart> carts = new HashSet<Cart>(0);

	public Item() {
	}
	
	public Item(IItem source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getId()
	 */
	@Override
	public ItemId getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setId(com.airavat.panya.db.entities.ItemId)
	 */
	@Override
	public void setId(ItemId id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getDiscount()
	 */
	@Override
	public Discount getDiscount() {
		return discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setDiscount(com.airavat.panya.db.entities.Discount)
	 */
	@Override
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getShopkeeperProfile()
	 */
	@Override
	public ShopkeeperProfile getShopkeeperProfile() {
		return shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setShopkeeperProfile(com.airavat.panya.db.entities.ShopkeeperProfile)
	 */
	@Override
	public void setShopkeeperProfile(ShopkeeperProfile shopkeeperProfile) {
		this.shopkeeperProfile = shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getItemBrand()
	 */
	@Override
	public String getItemBrand() {
		return itemBrand;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setItemBrand(java.lang.String)
	 */
	@Override
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getItemDesc()
	 */
	@Override
	public String getItemDesc() {
		return itemDesc;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setItemDesc(java.lang.String)
	 */
	@Override
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getItemName()
	 */
	@Override
	public String getItemName() {
		return itemName;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setItemName(java.lang.String)
	 */
	@Override
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getItemPrice()
	 */
	@Override
	public int getItemPrice() {
		return itemPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setItemPrice(int)
	 */
	@Override
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getItemUnit()
	 */
	@Override
	public String getItemUnit() {
		return itemUnit;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setItemUnit(java.lang.String)
	 */
	@Override
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getCarts()
	 */
	@Override
	public Set<Cart> getCarts() {
		return carts;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setCarts(java.util.Set)
	 */
	@Override
	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}
	
}
