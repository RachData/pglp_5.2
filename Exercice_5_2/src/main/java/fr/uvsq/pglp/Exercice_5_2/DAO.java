package fr.uvsq.pglp.Exercice_5_2;

import java.io.Serializable;
import java.sql.Connection;

public abstract class DAO<T> implements Serializable{
	protected Connection connect = null;
	   
	public DAO(Connection conn){
	    this.connect = conn;
	}
	   
	
	public abstract T create(T obj);
	public abstract T find(int id);
	public abstract T update( T obj);
	public abstract void delete (T obj);

}
