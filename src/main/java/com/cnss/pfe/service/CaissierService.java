package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.CaissierDao;
import com.cnss.pfe.persistance.model.Caissier;

@Service
@Transactional
public class CaissierService implements ICaissierService {
@Autowired 
CaissierDao caissierDao;
@Override
public void add(Caissier caissier) {
	// TODO Auto-generated method stub
	caissierDao.save(caissier);
}

@Override
public void delete(Caissier caissier) {
	// TODO Auto-generated method stub
	caissierDao.delete(caissier);
}

@Override
public void update(Caissier caissier) {
	// TODO Auto-generated method stub
	caissierDao.save(caissier);
	
}

@Override
public List<Caissier> findAll() {
	// TODO Auto-generated method stub
	return caissierDao.findAll();
}


}
