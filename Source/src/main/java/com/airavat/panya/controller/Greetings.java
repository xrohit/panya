/**
 * 
 */
package com.airavat.panya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
