package com.arquitecturajava.ejemplo005;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private ArrayList<Casa> casas;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.casas = new ArrayList<>();
	}

	public boolean add(Casa casa) {
		return casas.add(casa);
	}

	public boolean contains(Object o) {
		return casas.contains(o);
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
