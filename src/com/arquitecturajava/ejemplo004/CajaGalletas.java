package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;

public class CajaGalletas {
	
	private ArrayList<Galleta> galletas;

	public CajaGalletas() {
		galletas = new ArrayList<>();
	}

	public ArrayList<Galleta> getGalletas() {
		return galletas;
	}

	public void setGalletas(ArrayList<Galleta> galletas) {
		this.galletas = galletas;
	}
	
	public void addGalleta(Galleta galleta) {
		//delegando en el arrayList para aniadir galletas
		galletas.add(galleta);
	}
	
	public void addGalleta(String sabor, double precio) {
		galletas.add(new Galleta(sabor, precio));
	}
	
	public int totalGalleta() {
		return galletas.size();
	}
	
	public double precioTotal() {
		double total = 0;
		for(Galleta galleta: galletas) {
			total += galleta.getPrecio();
		}
		return 1 + total;
	}

}
