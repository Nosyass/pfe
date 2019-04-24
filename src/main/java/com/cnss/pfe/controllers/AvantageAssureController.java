package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.AvantageAssure;
import com.cnss.pfe.service.IAvantageAssureService;

@RestController
@RequestMapping("/avantage_assure")
public class AvantageAssureController {
	@Autowired
	IAvantageAssureService avantage_assureService ;
	@GetMapping("/liste")
	public List<AvantageAssure> findAll() {
		// TODO Auto-generated method stub
		
		return avantage_assureService.findAll();
	}

}

