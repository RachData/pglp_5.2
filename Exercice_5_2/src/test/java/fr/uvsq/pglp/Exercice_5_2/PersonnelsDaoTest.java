package fr.uvsq.pglp.Exercice_5_2;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class PersonnelsDaoTest {
	Personnels persoSave;
	Personnels persoGet;
	
	@Before
	  public void setup() {
		
		persoSave= new Personnels
				.Builder("Derra", "Abdoul", 2).build();
		
	}



	@Test
	public void test() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			System.out.println("passer");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String dburl="jdbc:derby:test;create=true";
		
		Properties connecProps=new Properties();
		connecProps.put("user", "pglp");
		connecProps.put("password", 123456);
		
		Connection conn=null;
		try {
			//conn = DriverManager.getConnection(dburl,connecProps);
			conn = DriverManager.getConnection("jdbc:derby:test;create=true");
			System.out.println("passer dans try");
			PersonnelsDAO persoDao = DAOFactory.getPersonnelsDAO(conn);
			
			persoDao.create(persoSave);
			persoGet=persoDao.find(2);
			persoGet.print();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
