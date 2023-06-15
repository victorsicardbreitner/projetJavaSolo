package com.m2i.tp;

public class Personne {
    String nom = "";
	String prénom = "";
	String téléphone ="";
	String email ="";
	
	public Personne(String nm, String pren) {
		this.nom = nm;
		this.prénom=pren;
	}
	
	public Personne(String nm, String pren, String tel, String mail){
		this.nom = nm;
		this.prénom=pren;
		this.téléphone=tel;
		this.email=mail;
	}
}
