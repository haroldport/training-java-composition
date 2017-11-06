package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		
		//Galleta g1 = new Galleta("chocolate", 1);
		//System.out.println(g1.getSabor());
		
		Sobre s1 = new Sobre("azul", "chocolate", 1);
		System.out.println(s1.getColor());
		System.out.println(s1.getSabor());
		System.out.println(s1.getPrecio());

	}

}
