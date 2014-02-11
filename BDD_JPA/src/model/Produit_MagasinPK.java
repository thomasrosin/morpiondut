package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Produit_Magasin database table.
 * 
 */
@Embeddable
public class Produit_MagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int m_idMagasin;

	@Column(insertable=false, updatable=false)
	private int p_idProduit;

	
	public Produit_MagasinPK() {
	}
	public int getM_idMagasin() {
		return this.m_idMagasin;
	}
	public void setM_idMagasin(int m_idMagasin) {
		this.m_idMagasin = m_idMagasin;
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
		if (!(other instanceof Produit_MagasinPK)) {
			return false;
		}
		Produit_MagasinPK castOther = (Produit_MagasinPK)other;
		return 
			(this.m_idMagasin == castOther.m_idMagasin)
			&& (this.p_idProduit == castOther.p_idProduit);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.m_idMagasin;
		hash = hash * prime + this.p_idProduit;
		
		
		return hash;
	}
}