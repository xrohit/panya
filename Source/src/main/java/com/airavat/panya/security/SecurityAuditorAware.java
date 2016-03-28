/**
 * 
 */
package com.airavat.panya.security;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * @author prohit
 *
 */
public class SecurityAuditorAware implements AuditorAware<User> {

	  public User getCurrentAuditor() {
	    
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

	    if (authentication == null || !authentication.isAuthenticated()) {
	      return null;
	    }

	    // Need to take out User somehow and return it.
	    // return (User)authentication.getPrincipal();
	    return null;
	}
}
