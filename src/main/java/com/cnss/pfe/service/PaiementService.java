package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.PaiementDao;
import com.cnss.pfe.persistance.model.Paiement;

@Service
@Transactional
public class PaiementService implements IPaiementService {
@Autowired 
PaiementDao paiementDao;
	@Override
	public void add(Paiement paiement) {
		// TODO Auto-generated method stub
		paiementDao.save(paiement);
	}

	@Override
	public void delete(Paiement paiement) {
		// TODO Auto-generated method stub
		paiementDao.delete(paiement);
	}

	@Override
	public void update(Paiement paiement) {
		// TODO Auto-generated method stub
		paiementDao.save(paiement);
		
	}

	@Override
	public List<Paiement> findAll() {
		// TODO Auto-generated method stub
		return paiementDao.findAll();
	}

}
