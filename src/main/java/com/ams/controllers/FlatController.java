package com.ams.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ams.beans.FlatBean;
import com.ams.service.FlatService;






@RestController
@RequestMapping("/api")
public class FlatController {
	
	@Autowired
	private FlatService flatService;

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<FlatBean>> listAllUsers() {
	   return null;
	}

	@RequestMapping(value = "/flat/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody FlatBean flatBean, UriComponentsBuilder ucBuilder) {
        System.out.println("CREATED FLAT"); 		
		flatService.add(flatBean);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/flat/{id}").buildAndExpand(flatBean.getFlatId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/flat/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody FlatBean flatBean) {
		return null;
	}

	
}