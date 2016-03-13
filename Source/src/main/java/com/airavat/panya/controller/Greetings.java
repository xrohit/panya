/**
 * 
 */
package com.airavat.panya.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author prohit
 *
 */
@Controller
public class Greetings {
	
    @RequestMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(required=false, defaultValue="World") String name) {
        return ("==== in greeting ====");
    }

    @RequestMapping("/greeting-javaconfig")
    public @ResponseBody String greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        return ("==== in greeting ====");
    }

}
