package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Penalite;
import com.cnss.pfe.service.IPenaliteService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/penalite")
public class PenaliteController {
	@Autowired
	IPenaliteService penaliteService ;
	@GetMapping("/liste")
	public List<Penalite> findAll() {
		// TODO Auto-generated method stub
		
		return penaliteService.findAll();
	}

}

