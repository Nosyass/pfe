package com.cnss.pfe.persistance.model;
// Generated 21 avr. 2019 12:25:46 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Region generated by hbm2java
 */
@Entity
@Table(name = "region")
public class Region implements java.io.Serializable {

	@Id
	private int cleReg;
	
	private String nomGouvernorat;

	public Region() {
	}

	public int getCleReg() {
		return cleReg;
	}

	public void setCleReg(int cleReg) {
		this.cleReg = cleReg;
	}

	public String getNomGouvernorat() {
		return nomGouvernorat;
	}

	public void setNomGouvernorat(String nomGouvernorat) {
		this.nomGouvernorat = nomGouvernorat;
	}

	
}
	