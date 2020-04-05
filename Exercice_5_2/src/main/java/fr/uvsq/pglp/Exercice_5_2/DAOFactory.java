package fr.uvsq.pglp.Exercice_5_2;

import java.sql.Connection;

public class DAOFactory {
	
	public static DAO<Personnels> PersonnelsDAO(Connection conn){
		return new PersonnelsDAO(conn);
	}
	
	public static DAO<CompositePerso> getCompositePerso(Connection conn){
		return new CompositePersoDAO(conn);
	}


}
