package com.tactfactory.tp2tdd.fusee;

import java.util.ArrayList;

public class Commandement extends Compartiment {

	private ArrayList<Pilote> pilotes;
	private IA ia;
	private int masse;
	
	public Commandement(ArrayList<Pilote> pilotes, IA ia, int masse) {
		super();
		this.pilotes = pilotes;
		this.ia = ia;
		this.masse = masse;
	}

	public ArrayList<Pilote> getPilotes() {
		return pilotes;
	}

	public void setPilotes(ArrayList<Pilote> pilotes) {
		this.pilotes = pilotes;
	}

	public IA isIA() {
		return ia;
	}

	public void setIA(IA ia) {
		this.ia = ia;
	}

	public int getMasse() {
		return masse;
	}

	public void setMasse(int masse) {
		this.masse = masse;
	}	
}
