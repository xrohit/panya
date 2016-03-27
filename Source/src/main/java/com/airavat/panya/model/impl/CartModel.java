/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Cart;
import com.airavat.panya.model.ICart;

/**
 * @author prohit
 *
 */
public class CartModel implements ICart {

	private CartIdModel id;
	private ItemModel item;
	private String createdBy;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	public CartModel() {
	}
	
	public CartModel(Cart source, boolean recursive) {
		BeanUtils.copyProperties(source, this, "id", "item");
		this.id = new CartIdModel(source.getId());
		if(recursive) {
			this.item = new ItemModel(source.getItem(), false);
		}
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getId()
	 */
	public CartIdModel getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setId(com.airavat.panya.db.entities.CartId)
	 */
	public void setId(CartIdModel id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getItem()
	 */
	public ItemModel getItem() {
		return item;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setItem(com.airavat.panya.db.entities.Item)
	 */
	public void setItem(ItemModel item) {
		this.item = item;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.ICart#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
