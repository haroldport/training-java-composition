package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		
		Casa c = new Casa("Carcelen");
		Persona p = new Persona("Harold");
		Persona p1 = new Persona("Ana");
		c.add(p);
		c.add(p1);
		System.out.println(c.contains(new Persona("Ana")));
		System.out.println(c.totalPersonas());
		
		p.add(c);
		System.out.println(p.contains(c));

	}

}
