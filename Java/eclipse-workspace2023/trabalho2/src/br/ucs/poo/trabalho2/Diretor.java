package br.ucs.poo.trabalho2;

import java.io.Serializable;

public class Diretor extends Pessoa implements Serializable{

	@Override
	public String toString() {
		return "Diretor: "+ this.nome+ "" ;
	}
	public Diretor() {
		
	}
}
