package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.PenaliteDao;
import com.cnss.pfe.persistance.model.Penalite;
@Service
@Transactional
public class PenaliteService implements IPenaliteService {
@Autowired 
PenaliteDao penaliteDao;
	@Override
	public void add(Penalite penalite) {
		// TODO Auto-generated method stub
		penaliteDao.save(penalite);
	}

	@Override
	public void delete(Penalite penalite) {
		// TODO Auto-generated method stub
		penaliteDao.delete(penalite);
	}

	@Override
	public void update(Penalite penalite) {
		// TODO Auto-generated method stub
	penaliteDao.save(penalite );
		
	}

	@Override
	public List<Penalite> findAll() {
		// TODO Auto-generated method stub
		return penaliteDao.findAll();
	}

}
