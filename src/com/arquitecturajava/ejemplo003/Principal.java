package com.arquitecturajava.ejemplo003;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> miLista = new ArrayList<>();
		miLista.add("Hola");
		miLista.add("que");
		miLista.add("tal");
		miLista.add("estas");
		
		for(int i = 0; i < miLista.size(); i++) {
			System.out.println(miLista.get(i));
		}
		
		//bucle for each
		for(String cadena: miLista) {
			System.out.println(cadena);
		}
		
		System.out.println(miLista.contains("que"));
		
		miLista.clear();
		miLista.add("loco");
		miLista.remove("loco");
		for(String cadena: miLista) {
			System.out.println(cadena);
		}

	}

}
