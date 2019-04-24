package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Assure;

import com.cnss.pfe.service.IAssureService;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/assure")
public class AssureController {
	@Autowired
	IAssureService assureService ;
	@GetMapping("/liste")
	public List<Assure> findAll() {
		// TODO Auto-generated method stub
		
		return assureService.findAll();
	}
	
	


}

