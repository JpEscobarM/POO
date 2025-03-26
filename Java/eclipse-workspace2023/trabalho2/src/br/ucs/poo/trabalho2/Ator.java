package br.ucs.poo.trabalho2;

import java.io.Serializable;

public class Ator extends Pessoa implements Serializable{
	
	public Ator() {
		
	}
	@Override
	public String toString() {
		return "Ator: "+ this.nome+ "]" ;
	}

}
