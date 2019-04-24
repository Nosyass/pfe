package com.cnss.pfe.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.pfe.persistance.model.Connexion;

public interface ConnexionDao extends JpaRepository<Connexion, Integer> {

}
