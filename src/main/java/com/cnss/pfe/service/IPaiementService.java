package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Paiement;



public interface IPaiementService {
public void add(Paiement paiement);
public void delete(Paiement paiement);
public void update(Paiement paiement);
public List<Paiement>findAll();
}