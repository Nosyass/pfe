package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Region;
import com.cnss.pfe.service.IRegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
	@Autowired
	IRegionService regionService ;
	@GetMapping("/liste")
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		
		return regionService.findAll();
	}

}

