package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		//regla de negocio
		//dos personas son iguales, si su nombre coincide
		Persona p = new Persona("Juan");
		
		Persona p1 = new Persona("Juan");
		
		//Java siempre revisa primero los hashCode y luego los equals
		
		//forma rapida
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		//forma directa
		System.out.println(p.equals(p1));
		
//		System.out.println(p.getNombre());
//		System.out.println(p1.getNombre());
//		
//		System.out.println(p == p1);
//		System.out.println(p);
//		System.out.println(p1);

	}

}
