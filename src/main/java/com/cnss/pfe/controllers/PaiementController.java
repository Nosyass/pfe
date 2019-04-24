package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Paiement;
import com.cnss.pfe.service.IPaiementService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/paiement")
public class PaiementController {
	
	
	
	@Autowired
	IPaiementService paiementService ;
	@GetMapping("/liste")
	public List<Paiement> findAll() {
		// TODO Auto-generated method stub
		
		return paiementService.findAll();
	}

}
