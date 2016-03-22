/**
 * 
 */
package com.airavat.panya.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airavat.panya.db.dao.UsersDao;
import com.airavat.panya.db.entities.Users;
import com.airavat.panya.model.IUser;
import com.airavat.panya.model.impl.User;


/**
 * @author prohit
 *
 */
@Controller
public class UserController implements BaseController {

	@Autowired
	UsersDao usersDao;	
	
	@RequestMapping(API_BASE_PATH + "get")
    public @ResponseBody IUser greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String id) {
		
		IUser user = null;
		try {
		
			user = new User(usersDao.findById(Long.parseLong(id)));
        
		} catch (Exception e) {
			
			user = new User();
		}
		return user;
    }
	
}
