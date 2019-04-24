package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.AssureDao;
import com.cnss.pfe.persistance.model.Assure;


@Service
@Transactional
public class AssureService implements IAssureService {
@Autowired 
AssureDao assureDao;
	@Override
	public void add(Assure assure) {
		// TODO Auto-generated method stub
		assureDao.save(assure);
	}

	@Override
	public void delete(Assure assure) {
		// TODO Auto-generated method stub
		assureDao.delete(assure);
	}

	@Override
	public void update(Assure assure) {
		// TODO Auto-generated method stub
		assureDao.save(assure);
		
	}

	@Override
	public List<Assure> findAll() {
		// TODO Auto-generated method stub
		return assureDao.findAll();
	}


}
