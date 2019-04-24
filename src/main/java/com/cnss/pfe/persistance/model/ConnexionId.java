package com.cnss.pfe.persistance.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConnexionId implements java.io.Serializable {

	private String login;
	private String mdp;
	private String statut;

	public ConnexionId() {
	}

	public ConnexionId(String login, String mdp, String statut) {
		this.login = login;
		this.mdp = mdp;
		this.statut = statut;
	}

	@Column(name = "login", nullable = false, length = 15)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "mdp", nullable = false, length = 15)
	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Column(name = "statut", nullable = false, length = 20)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConnexionId))
			return false;
		ConnexionId castOther = (ConnexionId) other;

		return ((this.getLogin() == castOther.getLogin()) || (this.getLogin() != null && castOther.getLogin() != null
				&& this.getLogin().equals(castOther.getLogin())))
				&& ((this.getMdp() == castOther.getMdp()) || (this.getMdp() != null && castOther.getMdp() != null
						&& this.getMdp().equals(castOther.getMdp())))
				&& ((this.getStatut() == castOther.getStatut()) || (this.getStatut() != null
						&& castOther.getStatut() != null && this.getStatut().equals(castOther.getStatut())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result + (getMdp() == null ? 0 : this.getMdp().hashCode());
		result = 37 * result + (getStatut() == null ? 0 : this.getStatut().hashCode());
		return result;
	}

}
