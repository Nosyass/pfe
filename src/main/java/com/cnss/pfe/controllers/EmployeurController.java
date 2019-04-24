package com.cnss.pfe.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Employeur;
import com.cnss.pfe.service.IEmployeurService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employeur")
public class EmployeurController {
@Autowired	
IEmployeurService employeurService;
@GetMapping("/liste")
public List<Employeur> findAll() {
	return employeurService.findAll();
}
}
