package com.cnss.pfe.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.pfe.persistance.model.Caissier;

public interface CaissierDao extends JpaRepository<Caissier, Integer> {

}
