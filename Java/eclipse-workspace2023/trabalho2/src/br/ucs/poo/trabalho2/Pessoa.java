package br.ucs.poo.trabalho2;

import java.io.Serializable;

public abstract class Pessoa implements Serializable{
	String nome;
	String paisOrigem;
	String conjuge; //casado com
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getConjuge() {
		return conjuge;
	}
	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

}
