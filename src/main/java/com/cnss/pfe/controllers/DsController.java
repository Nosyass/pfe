package com.cnss.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnss.pfe.persistance.model.Ds;
import com.cnss.pfe.service.IDsService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ds")
public class DsController {
	@Autowired
	IDsService dsService ;
	@GetMapping("/liste")
	public List<Ds> findAll() {
		// TODO Auto-generated method stub
		
		return dsService.findAll();
	}
	@GetMapping("/find")
	public List<Ds> findByCleEmp(@RequestParam int cleEmp,@RequestParam int cleExp) {
		// TODO Auto-generated method stub
		System.out.println("cleEmp"+cleEmp + "cleExp"+cleExp );

		
		List<Ds> listDsEmp= dsService.findByCriteria(cleEmp,cleExp);
		return listDsEmp;
	}

}


