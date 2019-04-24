package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.AvantageAssureDao;
import com.cnss.pfe.persistance.model.AvantageAssure;

@Service
@Transactional
public class AvantageAssureService implements IAvantageAssureService {
@Autowired 
AvantageAssureDao avantage_assureDao;
	@Override
	public void add(AvantageAssure avantage_assure) {
		// TODO Auto-generated method stub
		avantage_assureDao.save(avantage_assure);
	}

	@Override
	public void delete(AvantageAssure avantage_assure) {
		// TODO Auto-generated method stub
		avantage_assureDao.delete(avantage_assure);
	}

	@Override
	public void update(AvantageAssure avantage_assure) {
		// TODO Auto-generated method stub
		avantage_assureDao.save(avantage_assure);
		
	}

	@Override
	public List<AvantageAssure> findAll() {
		// TODO Auto-generated method stub
		return avantage_assureDao.findAll();
	}

}

