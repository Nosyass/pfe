package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.ResponsablePenaliteDao;
import com.cnss.pfe.persistance.model.ResponsablePenalite;

@Service
@Transactional
public class ResponsablePenaliteService implements IResponsablePenaliteService {
@Autowired 
ResponsablePenaliteDao responsable_penaliteDao;
@Override
public void add(ResponsablePenalite responsable_penalite) {
	// TODO Auto-generated method stub
	responsable_penaliteDao.save(responsable_penalite);
}

@Override
public void delete(ResponsablePenalite responsable_penalite) {
	// TODO Auto-generated method stub
	responsable_penaliteDao.delete(responsable_penalite);
}

@Override
public void update(ResponsablePenalite responsable_penalite) {
	// TODO Auto-generated method stub
	responsable_penaliteDao.save(responsable_penalite);
	
}

@Override
public List<ResponsablePenalite> findAll() {
	// TODO Auto-generated method stub
	return responsable_penaliteDao.findAll();
}


}

