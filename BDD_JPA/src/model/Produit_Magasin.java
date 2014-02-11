package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Produit_Magasin database table.
 * 
 */
@Entity
@NamedQuery(name="Produit_Magasin.findAll", query="SELECT p FROM Produit_Magasin p")
public class Produit_Magasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Produit_MagasinPK id;

	@Column(name="mp_prix")
	private double mpPrix;

	//bi-directional many-to-one association to Magasin
	@ManyToOne
	@JoinColumn(name="m_idMagasin", insertable = false, updatable = false)
	private Magasin magasin;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="p_idProduit", insertable = false, updatable = false)
	private Produit produit;

	//bi-directional many-to-one association to Secteur
	@ManyToOne
	@JoinColumn(name="s_idSecteur")
	private Secteur secteur;

	public Produit_Magasin() {
	}

	public Produit_MagasinPK getId() {
		return this.id;
	}

	public void setId(Produit_MagasinPK id) {
		this.id = id;
	}

	public double getMpPrix() {
		return this.mpPrix;
	}

	public void setMpPrix(double mpPrix) {
		this.mpPrix = mpPrix;
	}

	public Magasin getMagasin() {
		return this.magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Secteur getSecteur() {
		return this.secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}

}