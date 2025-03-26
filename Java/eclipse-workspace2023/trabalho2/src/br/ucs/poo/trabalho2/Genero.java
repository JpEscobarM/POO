package br.ucs.poo.trabalho2;

import java.io.Serializable;
import java.util.Objects;

public class Genero implements Serializable{
	private String genero;
	
	public Genero() {
		
	}
	
	
	public Genero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		return  genero + "";
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		return Objects.equals(genero, other.genero);
	}
}
