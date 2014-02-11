package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Secteur database table.
 * 
 */
@Entity
@NamedQuery(name="Secteur.findAll", query="SELECT s FROM Secteur s")
public class Secteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int s_idSecteur;

	@Column(name="s_etage")
	private int sEtage;

	@Lob
	@Column(name="s_nom")
	private String sNom;

	@Column(name="s_x")
	private int sX;

	@Column(name="s_y")
	private int sY;

	//bi-directional many-to-one association to Produit_Magasin
	@OneToMany(mappedBy="secteur")
	private List<Produit_Magasin> produitMagasins;

	public Secteur() {
	}

	public int getS_idSecteur() {
		return this.s_idSecteur;
	}

	public void setS_idSecteur(int s_idSecteur) {
		this.s_idSecteur = s_idSecteur;
	}

	public int getSEtage() {
		return this.sEtage;
	}

	public void setSEtage(int sEtage) {
		this.sEtage = sEtage;
	}

	public String getSNom() {
		return this.sNom;
	}

	public void setSNom(String sNom) {
		this.sNom = sNom;
	}

	public int getSX() {
		return this.sX;
	}

	public void setSX(int sX) {
		this.sX = sX;
	}

	public int getSY() {
		return this.sY;
	}

	public void setSY(int sY) {
		this.sY = sY;
	}

	public List<Produit_Magasin> getProduitMagasins() {
		return this.produitMagasins;
	}

	public void setProduitMagasins(List<Produit_Magasin> produitMagasins) {
		this.produitMagasins = produitMagasins;
	}

	public Produit_Magasin addProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().add(produitMagasin);
		produitMagasin.setSecteur(this);

		return produitMagasin;
	}

	public Produit_Magasin removeProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().remove(produitMagasin);
		produitMagasin.setSecteur(null);

		return produitMagasin;
	}

}