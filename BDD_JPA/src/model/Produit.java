package model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Produit database table.
 * 
 */
@Entity
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_idProduit;


	private String p_codeProduit;

	@Column(name="p_x")
	private int pX;
	
	@Column(name="p_description")
	private String pDescription;

	@Column(name="p_y")
	private int pY;

	@Column(name="p_nom")
	private String pNom;

	//bi-directional many-to-one association to Commande_Produit
	@OneToMany(mappedBy="produit")
	private List<Commande_Produit> commandeProduits;

	//bi-directional many-to-one association to Produit_Magasin
	@OneToMany(mappedBy="produit")
	private List<Produit_Magasin> produitMagasins;

	public Produit() {
	}

	public int getP_idProduit() {
		return this.p_idProduit;
	}

	public void setP_idProduit(int p_idProduit) {
		this.p_idProduit = p_idProduit;
	}

	public String getP_codeProduit() {
		return this.p_codeProduit;
	}

	public void setP_codeProduit(String p_codeProduit) {
		this.p_codeProduit = p_codeProduit;
	}

	public String getPNom() {
		return this.pNom;
	}

	public void setPNom(String pNom) {
		this.pNom = pNom;
	}

	public List<Commande_Produit> getCommandeProduits() {
		return this.commandeProduits;
	}

	public void setCommandeProduits(List<Commande_Produit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

	public Commande_Produit addCommandeProduit(Commande_Produit commandeProduit) {
		getCommandeProduits().add(commandeProduit);
		commandeProduit.setProduit(this);

		return commandeProduit;
	}

	public Commande_Produit removeCommandeProduit(Commande_Produit commandeProduit) {
		getCommandeProduits().remove(commandeProduit);
		commandeProduit.setProduit(null);

		return commandeProduit;
	}

	public List<Produit_Magasin> getProduitMagasins() {
		return this.produitMagasins;
	}

	public void setProduitMagasins(List<Produit_Magasin> produitMagasins) {
		this.produitMagasins = produitMagasins;
	}

	public Produit_Magasin addProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().add(produitMagasin);
		produitMagasin.setProduit(this);

		return produitMagasin;
	}

	public Produit_Magasin removeProduitMagasin(Produit_Magasin produitMagasin) {
		getProduitMagasins().remove(produitMagasin);
		produitMagasin.setProduit(null);

		return produitMagasin;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

}