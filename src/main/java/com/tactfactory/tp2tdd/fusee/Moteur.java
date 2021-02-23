package com.tactfactory.tp2tdd.fusee;

public class Moteur extends Compartiment {

	private int puissance;
	private Reservoir reservoir;
	private int masse;
	
	public Moteur(int puissance, Reservoir reservoir, int masse) {
		super();
		this.puissance = puissance;
		this.reservoir = reservoir;
		this.masse = masse;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	public Reservoir getReservoir() {
		return reservoir;
	}
	
	public void setReservoir(Reservoir reservoir) {
		this.reservoir = reservoir;
	}
	
	public int getMasse() {
		return masse;
	}
	
	public void setMasse(int masse) {
		this.masse = masse;
	}
}
