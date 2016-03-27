/**
 * 
 */
package com.airavat.panya.model.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.db.entities.Discount;
import com.airavat.panya.db.entities.Item;
import com.airavat.panya.model.IDiscount;

/**
 * @author prohit
 *
 */
public class DiscountModel implements IDiscount {

	private long discountId;
	private int discount;
	private Date discountExpiry;
	private String discountName;
	private Date discountStart;
	private int discountType;
	private String createdBy;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;
	private Set<ItemModel> items = new HashSet<ItemModel>(0);

	public DiscountModel() {
	}

	public DiscountModel(Discount source, boolean recursive) {
		BeanUtils.copyProperties(source, this, "items");
		if(recursive) {
			for(Item i : source.getItems()) {
				this.items.add(new ItemModel(i, false));
			}
		}
	}
	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscountId()
	 */
	@Override
	public long getDiscountId() {
		return discountId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscountId(long)
	 */
	@Override
	public void setDiscountId(long discountId) {
		this.discountId = discountId;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscount()
	 */
	@Override
	public int getDiscount() {
		return discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscount(int)
	 */
	@Override
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscountExpiry()
	 */
	@Override
	public Date getDiscountExpiry() {
		return discountExpiry;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscountExpiry(java.util.Date)
	 */
	@Override
	public void setDiscountExpiry(Date discountExpiry) {
		this.discountExpiry = discountExpiry;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscountName()
	 */
	@Override
	public String getDiscountName() {
		return discountName;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscountName(java.lang.String)
	 */
	@Override
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscountStart()
	 */
	@Override
	public Date getDiscountStart() {
		return discountStart;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscountStart(java.util.Date)
	 */
	@Override
	public void setDiscountStart(Date discountStart) {
		this.discountStart = discountStart;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getDiscountType()
	 */
	@Override
	public int getDiscountType() {
		return discountType;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setDiscountType(int)
	 */
	@Override
	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getCreatedDate()
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setCreatedDate(java.util.Date)
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getModifiedDate()
	 */
	@Override
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setModifiedDate(java.util.Date)
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#getItems()
	 */
	public Set<ItemModel> getItems() {
		return items;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IDiscount#setItems(java.util.Set)
	 */
	public void setItems(Set<ItemModel> items) {
		this.items = items;
	}
}
