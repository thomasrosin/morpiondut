/**
 * 
 */
package code;

import inter.IAdminLAAPAD;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Compte;
import model.Horaire;
import model.Magasin;
import model.Secteur;
import model.Produit;;

/**
 * @author TeamFA
 *
 */
@Stateless
@Remote
public class AdminLAAPAD implements IAdminLAAPAD{
	
	@EJB IAdminLAAPAD IAdminEJB;
	@PersistenceContext(name="BDD_JPA")
	private EntityManager em;

	@Override
	public boolean ajouterCompte(String nom, String prenom, String mdp, String email, String numrue, String codeP, String ville ) {
		
		TypedQuery<Compte> tqc = em.createQuery("SELECT c FROM Compte c where c.c_nom = :param1 "
				+ "AND c.c_prenom = :param2 ",Compte.class);
		tqc.setParameter("param1",nom);
		tqc.setParameter("param2", prenom);
		tqc.setParameter("param3", ville);

		int dejaPresent = tqc.getMaxResults();
				
		try
		{
			if(dejaPresent == 0){
				Compte c = new Compte();			
				c.setCNom(nom);
				c.setCPrenom(prenom);
				c.setCMotdepasse(mdp);
				c.setCEmail(email);
				c.setmAdresse(numrue);
				c.setmCodepostal(codeP);
				c.setmVille(ville);

				em.persist(c);

				em.flush();
				em.close();
				
				return true;
			}
			else return false;
			
		}
		catch (Exception ex)
		{
			return false;
		}		
	}

	@Override
	public boolean modifierCompte(int id, String nom, String prenom, String mdp,
			String email, String numrue, String codeP, String ville) {
		try
		{
			TypedQuery<Compte> tqc = em.createQuery("SELECT c FROM Compte c where c.c_idUser = :param1",Compte.class);
			tqc.setParameter("param1",id);
			
			Compte cp = tqc.getSingleResult();
			
			cp.setCNom(nom);
			cp.setCPrenom(prenom);
			cp.setCMotdepasse(mdp);
			cp.setCEmail(email);
			cp.setmAdresse(numrue);
			cp.setmCodepostal(codeP);
			cp.setmVille(ville);

			em.persist(cp);

			em.flush();
			em.close();

			return true;
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean supprimerCompte(int id) {

		TypedQuery<Compte> tqc = em.createQuery("DELETE FROM Compte c where c.c_idUser = :param1",Compte.class);
		tqc.setParameter("param1",id);
		
		int res = tqc.executeUpdate();
		
		if(res > 0)	return true;
		else return false;
	}

	@Override
	public boolean ajouterProduit(String codeProduit, String nom, String description, Double prix,
			Magasin mag, Secteur sect) {
		
		TypedQuery<Compte> tqc = em.createQuery("SELECT c FROM Compte c where c.c_nom = :param1 "
				+ "AND c.c_prenom = :param2 ",Compte.class);
		tqc.setParameter("param1", codeProduit);
		tqc.setParameter("param2", nom);

		int dejaPresent = tqc.getMaxResults();

		try
		{
			if(dejaPresent == 0){
				Produit p = new Produit();
				p.setPNom(nom);
				p.setP_codeProduit(codeProduit);
				p.setpDescription(description);

				em.persist(p);

				em.flush();
				em.close();
				
				return true;
			}
			else return false;			
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean modifierProduit(int id, String codeProduit, String nom,
			Double prix, Magasin mag, Secteur sect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerProduit(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ajouterSecteur(String nom, int etage, double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifierSecteur(int id, String nom, int etage, double x,
			double y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerSecteur(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ajouterMagasin(String nom, String adresse, Double latitude,
			Double longitude, Horaire horaire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifierMagasin(int id, String nom, String adresse,
			Double latitude, Double longitude, Horaire horaire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerMagasin(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
