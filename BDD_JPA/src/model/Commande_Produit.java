package model;

import java.io.Serializable;
import javax.persistence.*;


//dzadaz
@Entity
@NamedQuery(name="Commande_Produit.findAll", query="SELECT c FROM Commande_Produit c")
public class Commande_Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Commande_ProduitPK id;

	@Column(name="cp_quantite")
	private int cpQuantite;

	//bi-directional many-to-one association to Commande
	@ManyToOne
	@JoinColumn(name="com_idCommande", insertable = false, updatable = false)
	private Commande commande;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="p_idProduit", insertable = false, updatable = false)
	private Produit produit;

	public Commande_Produit() {
	}

	public Commande_ProduitPK getId() {
		return this.id;
	}

	public void setId(Commande_ProduitPK id) {
		this.id = id;
	}

	public int getCpQuantite() {
		return this.cpQuantite;
	}

	public void setCpQuantite(int cpQuantite) {
		this.cpQuantite = cpQuantite;
	}

	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}