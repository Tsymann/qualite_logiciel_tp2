package com.tactfactory.tp2tdd.fusee;

import java.util.ArrayList;

public class Fusee {

	private String name;
	private ArrayList<Compartiment> compartiments;
	private int masse;

	public Fusee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name.equals("") || !((name.charAt(0) >= 65 && name.charAt(0) <= 90)
				|| (name.charAt(0) >= 97 && name.charAt(0) <= 122))) {
			throw new Exception();
		}
		this.name = Character.toString(name.charAt(0)).toUpperCase() + name.substring(1);
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
