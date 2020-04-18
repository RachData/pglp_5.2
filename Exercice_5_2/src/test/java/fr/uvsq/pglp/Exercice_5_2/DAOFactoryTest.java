package fr.uvsq.pglp.Exercice_5_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DAOFactoryTest {
	Personnels persoSave;
	Personnels persoGet;
	PersonnelsDAO persoDao;

	@Before
	public void setUp() throws Exception {
		persoGet=null;
		persoDao=null;
		persoSave= new Personnels
				.Builder("Derra", "Abdoul", 2).build();
	}

	@Test
	public void test() {
		//DAOFactory daoFactory = new DAOFactory();
		persoDao = DAOFactory.getPersonnelsDAO();
		persoGet=persoDao.create(persoSave);
		assertTrue(persoGet!=null);
	}

}
