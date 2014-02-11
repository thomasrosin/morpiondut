package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the Horaire database table.
 * 
 */
@Entity
@NamedQuery(name="Horaire.findAll", query="SELECT h FROM Horaire h")
public class Horaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int h_idHoraire;

	private Time h_horaireDebut;

	private Time h_horaireFin;

	@Column(name="h_jour")
	private String hJour;

	//bi-directional many-to-one association to Magasin
	@ManyToOne()
	@JoinColumn(name="m_idMagasin")
	private Magasin magasin;

	public Horaire() {
	}

	public int getH_idHoraire() {
		return this.h_idHoraire;
	}

	public void setH_idHoraire(int h_idHoraire) {
		this.h_idHoraire = h_idHoraire;
	}

	public Time getH_horaireDebut() {
		return this.h_horaireDebut;
	}

	public void setH_horaireDebut(Time h_horaireDebut) {
		this.h_horaireDebut = h_horaireDebut;
	}

	public Time getH_horaireFin() {
		return this.h_horaireFin;
	}

	public void setH_horaireFin(Time h_horaireFin) {
		this.h_horaireFin = h_horaireFin;
	}

	public String getHJour() {
		return this.hJour;
	}

	public void setHJour(String hJour) {
		this.hJour = hJour;
	}

	public Magasin getMagasin() {
		return this.magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

}