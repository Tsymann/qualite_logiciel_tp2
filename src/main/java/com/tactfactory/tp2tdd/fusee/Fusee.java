package com.tactfactory.tp2tdd.fusee;

import java.util.ArrayList;

public class Fusee {

	private String nom;
	private ArrayList<Compartiment> compartiments;
	private int masse;
	
	public Fusee(String nom, ArrayList<Compartiment> compartiments, int masse) {
		super();
		this.nom = nom;
		this.compartiments = compartiments;
		this.masse = masse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<Compartiment> getCompartiments() {
		return compartiments;
	}
	
	public void setCompartiments(ArrayList<Compartiment> compartiments) {
		this.compartiments = compartiments;
	}
	
	public int getMasse() {
		return masse;
	}
	
	public void setMasse(int masse) {
		this.masse = masse;
	}
}
