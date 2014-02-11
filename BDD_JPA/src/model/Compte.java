package model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the Compte database table.
 * 
 */
@Entity
@NamedQuery(name="Compte.findAll", query="SELECT c FROM Compte c")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_idUser;

	@Column(name="m_adresse")
	private String mAdresse;
	@Column(name="m_ville")
	private String mVille;
	@Column(name="m_codepostal")
	private String mCodepostal;
	@Column(name="c_email")
	private String cEmail;

	@Lob
	@Column(name="c_motdepasse")
	private String cMotdepasse;

	@Lob
	@Column(name="c_nom")
	private String cNom;

	@Lob
	@Column(name="c_prenom")
	private String cPrenom;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="compte")
	private List<Commande> commandes;

	public Compte() {
	}

	public int getC_idUser() {
		return this.c_idUser;
	}

	public void setC_idUser(int c_idUser) {
		this.c_idUser = c_idUser;
	}

	public String getCEmail() {
		return this.cEmail;
	}

	public void setCEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getCMotdepasse() {
		return this.cMotdepasse;
	}

	public void setCMotdepasse(String cMotdepasse) {
		this.cMotdepasse = cMotdepasse;
	}

	public String getCNom() {
		return this.cNom;
	}

	public void setCNom(String cNom) {
		this.cNom = cNom;
	}

	public String getCPrenom() {
		return this.cPrenom;
	}

	public void setCPrenom(String cPrenom) {
		this.cPrenom = cPrenom;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setCompte(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setCompte(null);

		return commande;
	}

	public String getmVille() {
		return mVille;
	}

	public void setmVille(String mVille) {
		this.mVille = mVille;
	}

	public String getmCodepostal() {
		return mCodepostal;
	}

	public void setmCodepostal(String mCodepostal) {
		this.mCodepostal = mCodepostal;
	}

	public String getmAdresse() {
		return mAdresse;
	}

	public void setmAdresse(String mAdresse) {
		this.mAdresse = mAdresse;
	}

}