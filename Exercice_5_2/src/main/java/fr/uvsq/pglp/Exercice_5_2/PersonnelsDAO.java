package fr.uvsq.pglp.Exercice_5_2;

/**
 * La classe PersonnelsDAO permet d'enregistrer le personnele
 * de l'entreprise
 * @author root
 *
 */
public class PersonnelsDAO extends DAO<Personnels>{

	@Override
	public Personnels create(Personnels obj) {
		return obj;
	}

	@Override
	public Personnels find(String rechercher) {

		Personnels perso=null;		
		return perso;
	}

	@Override
	public Personnels update(Personnels obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Personnels obj) {
		// TODO Auto-generated method stub
		
	}

}
