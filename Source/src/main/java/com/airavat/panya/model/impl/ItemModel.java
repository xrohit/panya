/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Cart;
import com.airavat.panya.db.entities.Item;
import com.airavat.panya.model.IItem;

/**
 * @author prohit
 *
 */
public class ItemModel implements IItem {

	private ItemIdModel id;
	private DiscountModel discount;
	private ShopkeeperProfileModel shopkeeperProfile;
	private String createdBy;
	private String itemBrand;
	private String itemDesc;
	private String itemName;
	private int itemPrice;
	private String itemUnit;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;
	private Set<CartModel> carts = new HashSet<CartModel>(0);

	public ItemModel() {
	}
	
	public ItemModel(Item source, boolean recursive) {
		BeanUtils.copyProperties(source, this, "id", "discount", "shopkeeperProfile", "carts");
		this.id = new ItemIdModel(source.getId());
		
		this.discount = new DiscountModel(source.getDiscount(), false);
		if(recursive) {
			this.shopkeeperProfile = new ShopkeeperProfileModel(source.getShopkeeperProfile(), false);
		}
		for(Cart c : source.getCarts()) {
			this.carts.add(new CartModel(c, false));
		}
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getId()
	 */
	public ItemIdModel getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setId(com.airavat.panya.db.entities.ItemId)
	 */
	public void setId(ItemIdModel id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getDiscount()
	 */
	public DiscountModel getDiscount() {
		return discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setDiscount(com.airavat.panya.db.entities.Discount)
	 */
	public void setDiscount(DiscountModel discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#getShopkeeperProfile()
	 */
	public ShopkeeperProfileModel getShopkeeperProfile() {
		return shopkeeperProfile;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setShopkeeperProfile(com.airavat.panya.db.entities.ShopkeeperProfile)
	 */
	public void setShopkeeperProfile(ShopkeeperProfileModel shopkeeperProfile) {
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
	public Set<CartModel> getCarts() {
		return carts;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IItem#setCarts(java.util.Set)
	 */
	public void setCarts(Set<CartModel> carts) {
		this.carts = carts;
	}
	
}
