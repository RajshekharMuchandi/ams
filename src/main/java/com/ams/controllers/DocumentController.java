package com.ams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ams.beans.DocumentBean;
import com.ams.service.DocumentService;

@RestController
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	DocumentService documentService; 

	@RequestMapping(value = "/findAll/", method = RequestMethod.GET)
	public ResponseEntity<List<DocumentBean>> findAll() {
		return new ResponseEntity<List<DocumentBean>>(documentService.findAll(), HttpStatus.OK);
	}


	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	public ResponseEntity<DocumentBean> findById(String id) {
		return new ResponseEntity<DocumentBean>(documentService.findById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody DocumentBean documentBean) {
		documentService.add(documentBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/update/", method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestBody DocumentBean documentBean) {
		documentService.update(documentBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	
	@RequestMapping(value = "/delete/", method = RequestMethod.POST)
	public ResponseEntity<?> delete(@RequestBody DocumentBean documentBean) {
		documentService.delete(documentBean);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

   
}
