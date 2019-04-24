package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.ConnexionDao;
import com.cnss.pfe.persistance.model.Connexion;

@Service
@Transactional
public class ConnexionService implements IConnexionService {
@Autowired 
ConnexionDao connexionDao;
@Override
public void add(Connexion connexion) {
	// TODO Auto-generated method stub
	connexionDao.save(connexion);
}

@Override
public void delete(Connexion connexion) {
	// TODO Auto-generated method stub
	connexionDao.delete(connexion);
}

@Override
public void update(Connexion connexion) {
	// TODO Auto-generated method stub
	connexionDao.save(connexion);
	
}

@Override
public List<Connexion> findAll() {
	// TODO Auto-generated method stub
	return connexionDao.findAll();
}


}
