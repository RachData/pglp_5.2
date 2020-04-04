package fr.uvsq.pglp.Exercice_5_2;

public class DAOFactory {
	
	public static DAO<Personnels> getPersonneDAO(){
		return new PersonnelsDAO();
	}

}
