package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Commande database table.
 * 
 */
@Entity
@NamedQuery(name="Commande.findAll", query="SELECT c FROM Commande c")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int com_idCommande;

	@Lob
	@Column(name="c_etat")
	private String cEtat;

	@Temporal(TemporalType.DATE)
	@Column(name="com_date")
	private Date comDate;

	private double com_montantTotal;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="c_idUser")
	private Compte compte;

	//bi-directional many-to-one association to Commande_Produit
	@OneToMany(mappedBy="commande")
	private List<Commande_Produit> commandeProduits;

	public Commande() {
	}

	public int getCom_idCommande() {
		return this.com_idCommande;
	}

	public void setCom_idCommande(int com_idCommande) {
		this.com_idCommande = com_idCommande;
	}

	public String getCEtat() {
		return this.cEtat;
	}

	public void setCEtat(String cEtat) {
		this.cEtat = cEtat;
	}

	public Date getComDate() {
		return this.comDate;
	}

	public void setComDate(Date comDate) {
		this.comDate = comDate;
	}

	public double getCom_montantTotal() {
		return this.com_montantTotal;
	}

	public void setCom_montantTotal(double com_montantTotal) {
		this.com_montantTotal = com_montantTotal;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public List<Commande_Produit> getCommandeProduits() {
		return this.commandeProduits;
	}

	public void setCommandeProduits(List<Commande_Produit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}

	public Commande_Produit addCommandeProduit(Commande_Produit commandeProduit) {
		getCommandeProduits().add(commandeProduit);
		commandeProduit.setCommande(this);

		return commandeProduit;
	}

	public Commande_Produit removeCommandeProduit(Commande_Produit commandeProduit) {
		getCommandeProduits().remove(commandeProduit);
		commandeProduit.setCommande(null);

		return commandeProduit;
	}

}