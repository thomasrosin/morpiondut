/**
 * 
 */
package inter;

import model.Horaire;
import model.Magasin;
import model.Secteur;

/**
 * @author TeamFA
 *
 */
public interface IAdminLAAPAD {
	
	/* **** USERS **** */

	/** Ajout d'un utilisateur return VRAI si OK, FALSE si erreur
	 * @param nom
	 * @param prenom
	 * @param mdp
	 * @param email
	 * @return boolean
	 *  */
	public boolean ajouterCompte(String nom, String prenom, String mdp, String email, String numrue, String codeP, String ville);

	/** Modifier un utilisateur return VRAI si OK FALSE si erreur
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param mdp
	 * @param email
	 * @return boolean */
	public boolean modifierCompte(int id, String nom, String prenom, String mdp, String email, String numrue, String codeP, String ville);

	/** Supprimer un utilisateur return VRAI si OK FALSE si erreur
	 * @param id
	 * @return boolean */
	public boolean supprimerCompte(int id);


	/* ****  PRODUITS **** */
	
	/** Fonction qui Ajoute un produit dans un Secteur et dans un Magasin
	    return VRAI si OK FALSE si erreur
	Attention verifier si un produit existe déjà recuperer l'id et l'ajouter au magasin sinon le creer et l'ajouter au magasin*/	
	public boolean ajouterProduit(String codeProduit, String nom, String description, Double prix, Magasin mag, Secteur sect);

	/** Fonction qui Modifie un produit
	 * 	@param id
	 *  @param codeProduit, identifiant du produit de type string
	 *  @param nom, nom du produit 
	 *  @param prix
	 *  @param mag, Magasin dans lequel est présent le produit
	 *  @param sect, Secteur dans lequel est situé le produit
	 *  @return boolean  
	 *   */	
	public boolean modifierProduit(int id, String codeProduit, String nom, Double prix, Magasin mag, Secteur sect);

	/** Fonction qui Supprime un produit
		return VRAI si OK false si erreur
		@param id
		@return boolean
		 */	
	public boolean supprimerProduit(int id);

	/* **** SECTEURS **** */
	
	/** Fonction qui permet d'ajouter un secteur à la base
	 * @param nom
	 * @param etage
	 * @param x, représente la longitute dans le magasin
	 * @param y, représente la latitude dans le magasin
	 */	
	public boolean ajouterSecteur(String nom, int etage, double x, double y);

	/** Fonction qui permet de Modifier un secteur 
	 * @param id
	 * @param nom
	 * @param etage
	 * @param x, représente la longitute dans le magasin
	 * @param y, représente la latitude dans le magasin 
	 * */	
	public boolean modifierSecteur(int id, String nom, int etage, double x, double y);

	/** Fonction qui Supprime un secteur
	 * @param id 
	 * @param nom
	 * @param etage
	 * @param x, représente la longitute dans le magasin
	 * @param y, représente la latitude dans le magasin
	 * */
	public boolean supprimerSecteur(int id);


	/* **** MAGASIN ****/
	
	/** Fonction qui permet d'ajouter un magasin 
	 * @param nom
	 * @param adresse
	 * @param latitude
	 * @param longitude
	 * @param horaire
	 * @return boolean
	 * */
	public boolean ajouterMagasin(String nom, String adresse, Double latitude, Double longitude, Horaire horaire);

	/** Fonction qui Modifie un magasin
	 * 
	 * @param id
	 * @param nom
	 * @param adresse
	 * @param latitude
	 * @param longitude
	 * @param h
	 * @return
	 */
	public boolean modifierMagasin(int id, String nom, String adresse, Double latitude, Double longitude, Horaire horaire);

	/** Fonction qui supprime un magasin
	 * 
	 * @param id
	 * @return
	 */
	public boolean supprimerMagasin(int id);

}
