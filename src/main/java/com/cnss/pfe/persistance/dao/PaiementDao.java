package com.cnss.pfe.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.pfe.persistance.model.Paiement;

public interface PaiementDao extends JpaRepository<Paiement, Integer> {

}
