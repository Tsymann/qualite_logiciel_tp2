package com.tactfactory.tp2tdd.fusee;

public class Reservoir {

	private int volume;
	private int masse;
	
	public Reservoir(int volume, int masse) {
		super();
		this.volume = volume;
		this.masse = masse;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getMasse() {
		return masse;
	}
	public void setMasse(int masse) {
		this.masse = masse;
	}	
}
