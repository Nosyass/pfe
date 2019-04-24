package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Caissier;
import com.cnss.pfe.service.ICaissierService;

@RestController
@RequestMapping("/caissier")
public class CaissierController {

	@Autowired
	ICaissierService caissierService;

	@GetMapping("/liste")
	public List<Caissier> findAll() {

		return caissierService.findAll();
	}

}
