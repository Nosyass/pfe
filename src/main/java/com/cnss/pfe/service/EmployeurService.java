package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.EmployeurDao;
import com.cnss.pfe.persistance.model.Employeur;

@Service
@Transactional
public class EmployeurService implements IEmployeurService {
	@Autowired
 EmployeurDao employeurDao ;
	@Override
	public void add(Employeur employeur) {
		// TODO Auto-generated method stub
		employeurDao.save(employeur);
		
	}

	@Override
	public void delete(Employeur employeur) {
		// TODO Auto-generated method stub
		employeurDao.delete(employeur);
	}

	@Override
	public void update(Employeur employeur) {
		// TODO Auto-generated method stub
		employeurDao.save(employeur);
		
	}

	@Override
	public List<Employeur> findAll() {
		// TODO Auto-generated method stub
		return employeurDao.findAll();
	}

}
