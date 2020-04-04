package fr.uvsq.pglp.Exercice_5_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompositePerso implements PersonelsInter, Serializable{
	
	/**
	 * a version d’un classe pour la sérialisation
	 */
	//private static final long serialVersionUID = 1L;
	private int IDgrp;
	public ArrayList<PersonelsInter> grpPerso=new ArrayList<PersonelsInter>();
	
	public ArrayList<PersonelsInter> gettab(){
		return (ArrayList<PersonelsInter>) Collections.unmodifiableList(this.grpPerso);
		
	}
	
	public CompositePerso(int IDgrp) {
		this.IDgrp=IDgrp;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("le Id du groupe est : "+this.IDgrp);
		for(PersonelsInter perso : grpPerso) {
			perso.print();
		}
	}
	
	public void add(PersonelsInter perso) {
		this.grpPerso.add(perso);
	}
	
	public void remove(Personnels perso) {
		this.grpPerso.remove(perso);
	}
	
	public String toString(){
		  String str = "\t je suis un composite ID ==>> " + this.IDgrp;
		  return str;
	}

}
