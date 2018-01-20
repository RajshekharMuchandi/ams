package com.ams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ams.beans.UserBean;
import com.ams.service.UserService;

/**
 * This is user CRUD controller
 * @author Rajshekhar
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService; 

	@RequestMapping(value = "/findAll/", method = RequestMethod.GET)
	public ResponseEntity<List<UserBean>> findAll() {
		return new ResponseEntity<List<UserBean>>(userService.findAll(), HttpStatus.OK);
	}


	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserBean> findById(String id) {
		return new ResponseEntity<UserBean>(userService.findById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody UserBean userBean) {
	    userService.add(userBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/update/", method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestBody UserBean userBean) {
	    userService.update(userBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	
	@RequestMapping(value = "/delete/", method = RequestMethod.POST)
	public ResponseEntity<?> delete(@RequestBody UserBean userBean) {
	    userService.delete(userBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

   
}
