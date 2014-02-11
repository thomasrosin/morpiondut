package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Commande_Produit database table.
 * 
 */
@Embeddable
public class Commande_ProduitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int com_idCommande;

	@Column(insertable=false, updatable=false)
	private int p_idProduit;

	public Commande_ProduitPK() {
	}
	public int getCom_idCommande() {
		return this.com_idCommande;
	}
	public void setCom_idCommande(int com_idCommande) {
		this.com_idCommande = com_idCommande;
	}
	public int getP_idProduit() {
		return this.p_idProduit;
	}
	public void setP_idProduit(int p_idProduit) {
		this.p_idProduit = p_idProduit;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Commande_ProduitPK)) {
			return false;
		}
		Commande_ProduitPK castOther = (Commande_ProduitPK)other;
		return 
			(this.com_idCommande == castOther.com_idCommande)
			&& (this.p_idProduit == castOther.p_idProduit);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.com_idCommande;
		hash = hash * prime + this.p_idProduit;
		
		return hash;
	}
}