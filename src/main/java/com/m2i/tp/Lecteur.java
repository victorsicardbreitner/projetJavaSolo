package com.m2i.tp;


public class Lecteur extends Personne {
    Integer identifiant = 0;
    String nom = "";
	String prénom = "";
	String téléphone ="";
	String email ="";
	
	
	public Lecteur(String nm, String pren, String tel, String mail){
		super(nm,pren, tel, mail);
		this.identifiant=0;
	}
}


