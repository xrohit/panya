/**
 * 
 */
package com.airavat.panya.security;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author prohit
 *
 */
@EnableWebSecurity
@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
	@Autowired
	private DataSource dataSource;

	 @Override
	 protected void configure(HttpSecurity http) throws Exception {

	        http
	            .authorizeRequests()
	          		.antMatchers("/api/admin").access("hasRole('ROLE_ADMIN')")  
	          		.antMatchers("/admin").access("hasRole('ROLE_ADMIN')")  // Just for testing remove later
	          		.antMatchers("/api/user").access("hasRole('ROLE_USER')")
	                //.antMatchers("/", "/home", "/public","/css/**","/fonts/**","/libs/**").permitAll()
	                //.anyRequest().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
//	        	    .usernameParameter("username").passwordParameter("password")
	                .and()
	            .formLogin()
	            	.permitAll()
	            	.and()	            
	            .logout()
	                .permitAll()
	          	  	.and()
	        	.logout()
	        		.logoutSuccessUrl("/login?logout") 
	        	   .and()
	        	.exceptionHandling()
	        		.accessDeniedPage("/403");
//	  .and()
//	    .csrf();
	 }
    

//@Autowired
//public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	auth
//		.jdbcAuthentication()
//		.dataSource(dataSource);
//}

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//	        auth
//	            .inMemoryAuthentication()
//	                .withUser("user").password("password").roles("USER");
	        //JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
	        //userDetailsService.setDataSource(dataSource);
	        //PasswordEncoder encoder = new BCryptPasswordEncoder();
	 
	        //auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
	        auth.jdbcAuthentication().dataSource(dataSource);
	 
//	        if(false && !userDetailsService.userExists("user")) {
//	            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//	            authorities.add(new SimpleGrantedAuthority("USER"));
//	            User userDetails = new User("user", encoder.encode("password"), authorities);
//	 
//	            userDetailsService.createUser(userDetails);
//	        }
	    }
    

}
