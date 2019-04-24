package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.DsDao;
import com.cnss.pfe.persistance.model.Ds;

@Service
@Transactional
public class DsService implements IDsService {
@Autowired 
DsDao dsDao;
	@Override
	public void add(Ds ds) {
		// TODO Auto-generated method stub
		dsDao.save(ds);
	}

	@Override
	public void delete(Ds ds) {
		// TODO Auto-generated method stub
		dsDao.delete(ds);
	}

	@Override
	public void update(Ds ds) {
		// TODO Auto-generated method stub
		dsDao.save(ds);
		
	}

	@Override
	public List<Ds> findAll() {
		// TODO Auto-generated method stub
		return dsDao.findAll();
	}

	@Override
	public List<Ds> findByCriteria(int cleEmp,int cleExp) {
		// TODO Auto-generated method stub
		return dsDao.findByCleEmpAndCleExp(cleEmp, cleExp);
	}

}

