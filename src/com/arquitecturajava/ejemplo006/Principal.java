package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		
		Persona carlos = new Persona("Carlos");
		Persona gema = new Persona("Gema");
		Persona miguel = new Persona("Miguel");
		
		miguel.addAmigo(gema);
		miguel.addAmigo(carlos);
		
		for(Persona p: miguel.getAmigos()) {
			System.out.println(p.getNombre());
		}

	}

}
