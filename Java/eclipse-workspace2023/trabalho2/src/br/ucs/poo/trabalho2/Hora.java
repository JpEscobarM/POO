package br.ucs.poo.trabalho2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hora implements Serializable{
	private String hora;
	List<Assento> assentos = new ArrayList();//assentos da sala
	private boolean ocupado;
	Filme filme;
	
	
	public Hora() {

	}
	public Hora(String hora) {
		this.hora = hora;
		//Fileira A
		this.assentos.add(new Assento("A",1));
		this.assentos.add(new Assento("A",2));
		this.assentos.add(new Assento("A",3));
		this.assentos.add(new Assento("A",4));
		this.assentos.add(new Assento("A",5));
		
		//Fileira B
		this.assentos.add(new Assento("B",1));
		this.assentos.add(new Assento("B",2));
		this.assentos.add(new Assento("B",3));
		this.assentos.add(new Assento("B",4));
		this.assentos.add(new Assento("B",5));
		
		//Fileira C
			this.assentos.add(new Assento("C",1));
			this.assentos.add(new Assento("C",2));
			this.assentos.add(new Assento("C",3));
			this.assentos.add(new Assento("C",4));
			this.assentos.add(new Assento("C",5));
			//Fileira D
			this.assentos.add(new Assento("D",1));
			this.assentos.add(new Assento("D",2));
			this.assentos.add(new Assento("D",3));
			this.assentos.add(new Assento("D",4));
			this.assentos.add(new Assento("D",5));
			//Fileira E
			this.assentos.add(new Assento("E",1));
			this.assentos.add(new Assento("E",2));
			this.assentos.add(new Assento("E",3));
			this.assentos.add(new Assento("E",4));
			this.assentos.add(new Assento("E",5));
	}
	
	
	public List<Assento> getAssentos() {
		return assentos;
	}
	public void setAssentos(List<Assento> assentos) {
		this.assentos = assentos;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public boolean getOcupado() {
		return ocupado;
	}
	
	
	@Override
	public String toString() {
		return  hora ;
	}
	
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
