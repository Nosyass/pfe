
package com.cnss.pfe.service;
import java.util.List;

import com.cnss.pfe.persistance.model.AvantageAssure;

public interface IAvantageAssureService {
	
	public void add(AvantageAssure avantage_assure);
	public void delete(AvantageAssure avantage_assure);
	public void update(AvantageAssure avantage_assure);
	public List<AvantageAssure>findAll();
}

