package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Magasin database table.
 * 
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames ="m_nom"))
@NamedQuery(name="Magasin.findAll", query="SELECT m FROM Magasin m")
public class Magasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int m_idMagasin;

	@Lob
	@Column(name="m_adresse")
	private String mAdresse;

	@Column(name="m_latitude")
	private double mLatitude;

	@Column(name="m_longitude")
	private double mLongitude;


	@Column(name="m_nom")
	private String mNom;

	//bi-directional many-to-one association to Horaire
	@OneToMany(mappedBy="magasin")
	private List<Horaire> horaires;

	//bi-directional many-to-one association to Produit_Magasin
	@OneToMany(mappedBy="magasin")
	private List<Produit_Magasin> produitMagasins;

	public Magasin() {
	}

	public int getM_idMagasin() {
		return this.m_idMagasin;
	}

	public void setM_idMagasin(int m_idMagasin) {
		this.m_idMagasin = m_idMagasin;
	}

	public String getMAdresse() {
		return this.mAdresse;
	}

	public void setMAdresse(String mAdresse) {
		this.mAdresse = mAdresse;
	}

	public double getMLatitude() {
		return this.mLatitude;
	}

	public void setMLatitude(double mLatitude) {
		this.mLatitude = mLatitude;
	}

	public double getMLongitude() {
		return this.mLongitude;
	}

	public void setMLongitude(double mLongitude) {
		this.mLongitude = mLongitude;
	}

	public String getMNom() {
		return this.mNom;
	}

	public void setMNom(String mNom) {
		this.mNom = mNom;
	}

	public List<Horaire> getHoraires() {
		return this.horaires;
	}

	public void setHoraires(List<Horaire> horaires) {
		this.horaires = horaires;
	}

	public Horaire addHoraire(Horaire horaire) {
		getHoraires().add(horaire);
		horaire.setMagasin(this);

		return horaire;
	}

	public Horaire removeHoraire(Horaire horaire) {
		getHoraires().remove(horaire);
		horaire.setMagasin(null);

		return horaire;
	}

	public List<Produit_Magasin> getProduitMagasins() {
		return this.produitMagasins;
	}

	public void setProduitMagasins(List<Produit_Magasin> produitMagasins) {
		this.produitMagasins = produitMagasins;
	}

	public Produit_Magasin addProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().add(produitMagasin);
		produitMagasin.setMagasin(this);

		return produitMagasin;
	}

	public Produit_Magasin removeProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().remove(produitMagasin);
		produitMagasin.setMagasin(null);

		return produitMagasin;
	}

}