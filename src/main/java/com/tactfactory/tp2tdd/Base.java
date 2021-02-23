package com.tactfactory.tp2tdd;

import java.util.ArrayList;

import com.tactfactory.tp2tdd.fusee.Fusee;
import com.tactfactory.tp2tdd.fusee.Planete;

public class Base {

	private String nom;
	private ArrayList<Fusee> fusees;
	private Planete planete;
	
	public Base(String nom, ArrayList<Fusee> fusees, Planete planete) {
		super();
		this.nom = nom;
		this.fusees = fusees;
		this.planete = planete;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Fusee> getFusees() {
		return fusees;
	}

	public void setFusees(ArrayList<Fusee> fusees) {
		this.fusees = fusees;
	}

	public Planete getPlanete() {
		return planete;
	}

	public void setPlanete(Planete planete) {
		this.planete = planete;
	}
}
