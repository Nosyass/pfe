package com.cnss.pfe.persistance.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.pfe.persistance.model.Ds;

public interface DsDao extends JpaRepository<Ds, Integer> {

List<Ds>	findByCleEmp(int x);
List<Ds> findByCleEmpAndCleExp(int x,int y);
}
