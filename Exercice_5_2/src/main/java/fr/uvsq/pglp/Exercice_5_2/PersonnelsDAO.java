package fr.uvsq.pglp.Exercice_5_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * La classe PersonnelsDAO permet d'enregistrer le personnele
 * de l'entreprise
 * @author root
 *
 */
public class PersonnelsDAO extends DAO<Personnels>{



	public PersonnelsDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Personnels create(Personnels obj) {
		try {
			
			Statement s;
	        s = connect.createStatement();
			try {
		        s.execute("create table derby(nom varchar(40), prenom varchar(40),Id int)");
		        System.out.println("Created table location");
			} catch (Exception e) {
				// TODO: handle exception
			}
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO derby (nom, prenom, Id) VALUES (?,?,?) ");
			prepare.setString(1, obj.getNom());
			prepare.setString(2, obj.getPrenom());
			prepare.setInt(3, obj.getId());
			prepare.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return obj;
	}

	@Override
	public Personnels find(int Id) {

		Personnels perso=null;
		try {
			PreparedStatement prepare = this.connect.prepareStatement("SELECT * FROM derby WHERE ID = ?");
			prepare.setInt(1, Id);
			ResultSet result= prepare.executeQuery();
			if(result.first()) {
				perso = new Personnels
						.Builder(result.getString("nom"), result.getString("prenom"), result.getInt("Id"))
						.build();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
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
