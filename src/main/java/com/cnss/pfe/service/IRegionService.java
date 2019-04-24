package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Region;

public interface IRegionService {
	
	public void add(Region region);
	public void delete(Region region);
	public void update(Region region);
	public List<Region>findAll();
	
}
