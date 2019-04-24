package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.ResponsablePenalite;
import com.cnss.pfe.service.IResponsablePenaliteService;

@RestController
@RequestMapping("/responsable_penalite")
public class ResponsablePenaliteController {
	@Autowired
	IResponsablePenaliteService responsable_penaliteService ;
	@GetMapping("/liste")
	public List<ResponsablePenalite> findAll() {
		// TODO Auto-generated method stub
		
		return responsable_penaliteService.findAll();
	}

}

