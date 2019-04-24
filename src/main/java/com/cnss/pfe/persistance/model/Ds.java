package com.cnss.pfe.persistance.model;
// Generated 21 avr. 2019 12:25:46 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ds")
public class Ds implements java.io.Serializable {

	private Integer cleDs;
	private Integer cleExp;
	private Integer cleEmp;
	private Date date;
	private Integer matriculeAss;
	private String identiteSalarie;
	private Integer numChezEmp;
	private String categ;
	private Integer totalGeneral;
	private Integer totalReporter;
	private Integer trimestre;
	private Integer annee;

	public Ds() {
	}

	@Id

	@Column(name = "cle_ds", unique = true)
	public Integer getCleDs() {
		return this.cleDs;
	}

	public void setCleDs(Integer cleDs) {
		this.cleDs = cleDs;
	}

	@Column(name = "cle_exp")
	public Integer getCleExp() {
		return this.cleExp;
	}

	public void setCleExp(Integer cleExp) {
		this.cleExp = cleExp;
	}

	@Column(name = "cle_emp")
	public Integer getCleEmp() {
		return this.cleEmp;
	}

	public void setCleEmp(Integer cleEmp) {
		this.cleEmp = cleEmp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "matricule_ass")
	public Integer getMatriculeAss() {
		return this.matriculeAss;
	}

	public void setMatriculeAss(Integer matriculeAss) {
		this.matriculeAss = matriculeAss;
	}

	@Column(name = "identite_salarie", length = 20)
	public String getIdentiteSalarie() {
		return this.identiteSalarie;
	}

	public void setIdentiteSalarie(String identiteSalarie) {
		this.identiteSalarie = identiteSalarie;
	}

	@Column(name = "num_chez_emp")
	public Integer getNumChezEmp() {
		return this.numChezEmp;
	}

	public void setNumChezEmp(Integer numChezEmp) {
		this.numChezEmp = numChezEmp;
	}

	@Column(name = "categ", length = 20)
	public String getCateg() {
		return this.categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	@Column(name = "total_general")
	public Integer getTotalGeneral() {
		return this.totalGeneral;
	}

	public void setTotalGeneral(Integer totalGeneral) {
		this.totalGeneral = totalGeneral;
	}

	@Column(name = "total_reporter")
	public Integer getTotalReporter() {
		return this.totalReporter;
	}

	public void setTotalReporter(Integer totalReporter) {
		this.totalReporter = totalReporter;
	}

	@Column(name = "trimestre")
	public Integer getTrimestre() {
		return this.trimestre;
	}

	public void setTrimestre(Integer trimestre) {
		this.trimestre = trimestre;
	}

	@Column(name = "annee")
	public Integer getAnnee() {
		return this.annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

}
