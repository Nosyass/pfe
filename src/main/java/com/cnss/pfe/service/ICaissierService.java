package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Caissier;



public interface ICaissierService {
public void add(Caissier assure);
public void delete(Caissier assure);
public void update(Caissier assure);
public List<Caissier>findAll();
}