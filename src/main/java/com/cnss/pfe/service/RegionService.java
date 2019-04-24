package com.cnss.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cnss.pfe.persistance.dao.RegionDao;
import com.cnss.pfe.persistance.model.Region;

@Service
@Transactional
public class RegionService implements IRegionService {
@Autowired 
RegionDao regionDao;
	@Override
	public void add(Region region) {
		// TODO Auto-generated method stub
		regionDao.save(region);
	}

	@Override
	public void delete(Region region) {
		// TODO Auto-generated method stub
		regionDao.delete(region);
	}

	@Override
	public void update(Region region) {
		// TODO Auto-generated method stub
		regionDao.save(region);
		
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return regionDao.findAll();
	}

}

