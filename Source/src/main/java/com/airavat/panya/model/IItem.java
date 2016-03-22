package com.airavat.panya.model;

import java.util.Date;
import java.util.Set;

import com.airavat.panya.db.entities.Cart;
import com.airavat.panya.db.entities.Discount;
import com.airavat.panya.db.entities.ItemId;
import com.airavat.panya.db.entities.ShopkeeperProfile;

public interface IItem {

	/**
	 * @return the id
	 */
	ItemId getId();

	/**
	 * @param id the id to set
	 */
	void setId(ItemId id);

	/**
	 * @return the discount
	 */
	Discount getDiscount();

	/**
	 * @param discount the discount to set
	 */
	void setDiscount(Discount discount);

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

	/**
	 * @return the carts
	 */
	Set<Cart> getCarts();

	/**
	 * @param carts the carts to set
	 */
	void setCarts(Set<Cart> carts);

}