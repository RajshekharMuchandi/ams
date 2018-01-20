package com.ams.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		System.out.println("In index controller");
		model.put("message", "HowToDoInJava Reader !!");
		return "home";
	}
	
//	@RequestMapping("/next")
//	public String next(Map<String, Object> model) {
//		model.put("message", "You are in new page !!");
//		return "next";
//	}
	
	 @RequestMapping(value="/admin")
	    public String admin(){
	        return "admin";
	    }
	   
	 @RequestMapping(value="/flat")
	    public String flat(){
	      return "flat";
	    }
	   
	    @RequestMapping(value={"/login"})
	    public String login(){
	        return "login";
	    }

}