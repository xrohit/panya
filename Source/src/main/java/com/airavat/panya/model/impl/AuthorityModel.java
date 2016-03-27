/**
 * 
 */
package com.airavat.panya.model.impl;

import org.springframework.beans.BeanUtils;

import com.airavat.panya.model.IAuthority;

/**
 * @author prohit
 *
 */
public class AuthorityModel implements IAuthority {


	private long id;
	private String authority;

	public AuthorityModel() {
	}
	
	public AuthorityModel(IAuthority source) {
		BeanUtils.copyProperties(source, this);
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IAuthority#getId()
	 */
	@Override
	public long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IAuthority#setId(long)
	 */
	@Override
	public void setId(long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IAuthority#getAuthority()
	 */
	@Override
	public String getAuthority() {
		return authority;
	}

	/* (non-Javadoc)
	 * @see com.airavat.panya.model.impl.IAuthority#setAuthority(java.lang.String)
	 */
	@Override
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	
}
