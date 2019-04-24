package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Assure;




public interface IAssureService {
public void add(Assure assure);
public void delete(Assure assure);
public void update(Assure assure);
public List<Assure>findAll();
}
