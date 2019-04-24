package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.ResponsablePenalite;

public interface IResponsablePenaliteService {
	public void add(ResponsablePenalite responsable_penalite);
	public void delete(ResponsablePenalite responsable_penalite);
	public void update(ResponsablePenalite responsable_penalite);
	public List<ResponsablePenalite>findAll();

}
