package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Connexion;
import com.cnss.pfe.service.IConnexionService;

@RestController
@RequestMapping("/connexion")
public class ConnexionController {
	
	
	
	@Autowired
	IConnexionService connexionService ;
	@GetMapping("/liste")
	public List<Connexion> findAll() {
		// TODO Auto-generated method stub
		
		return connexionService.findAll();
	}

}
