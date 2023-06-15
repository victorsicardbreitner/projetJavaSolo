package com.m2i.tp;

public class Livre {
    Integer identifiant = 0;
    String titre = "";
	String auteur = "";
	String téléphone ="";
	String email ="";
	
	public Livre() {

	}
	
	public Livre(String ttre, String aut, String tel, String mail){
		this.titre = ttre;
		this.auteur=aut;
		this.téléphone=tel;
		this.email=mail;
	}
}
