package com.cnss.pfe.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cnss.pfe.persistance.model.Employeur;

public interface EmployeurDao extends JpaRepository<Employeur, Integer> {
}
