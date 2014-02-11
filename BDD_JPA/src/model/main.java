package model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import utils.EntityManagerSingleton;

public class main {

	public static void main(String[] args) {
		EntityManager s = EntityManagerSingleton.getInstance();
		Produit p = new Produit();
		p.setPNom("String");
		p.setP_codeProduit("dazdazdaze");
		p.setpDescription("Tralala");
		s.getTransaction().begin();
		s.merge(p);
		s.getTransaction().commit();
		
		TypedQuery<Produit> tqp = (TypedQuery<Produit>) s.createNativeQuery("Select * from produit where p_idProduit=1", Produit.class);
		 p =tqp.getSingleResult();

		 Magasin m = new Magasin();
		 m.setMAdresse("Chez toi");
		 m.setMLatitude(0.1);
		 m.setMLongitude(0.2);
		 m.setMNom("Leclerc");
			s.getTransaction().begin();
			s.merge(m);
			s.getTransaction().commit(); 
		TypedQuery<Magasin> tqm = (TypedQuery<Magasin>) s.createNativeQuery("Select * from magasin where m_idMagasin=1", Magasin.class);
		 m =tqm.getSingleResult();
		Secteur sec = new Secteur();
		sec.setSNom("TaMere");
		sec.setSEtage(0);
		sec.setSX(0);
		sec.setSY(1);
		s.getTransaction().begin();
		s.merge(sec);
		s.getTransaction().commit();
		TypedQuery<Secteur> tqs = (TypedQuery<Secteur>) s.createNativeQuery("Select * from secteur where s_idSecteur=1", Secteur.class);
		sec =tqs.getSingleResult();
		System.out.println(sec.getSNom());
		Produit_Magasin pm = new Produit_Magasin();
		Produit_MagasinPK pmPK = new Produit_MagasinPK();
		pmPK.setM_idMagasin(m.getM_idMagasin());
		pmPK.setP_idProduit(p.getP_idProduit());
		
		pm.setId(pmPK);
		pm.setMagasin(m);
		pm.setProduit(p);
		pm.setMpPrix(10.010);
		pm.setSecteur(sec);
		s.getTransaction().begin();
		s.merge(pm);
		s.getTransaction().commit();

	}

}
