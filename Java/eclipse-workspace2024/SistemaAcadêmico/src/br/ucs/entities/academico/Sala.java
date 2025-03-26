package br.ucs.entities.academico;

public class Sala {
	private int numero = 0;
	private String nomeSala;
	
	public Sala() {
		this.nomeSala="Sala";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	
	@Override
	public String toString() {
		
		return this.nomeSala +" "+this.numero;
	}
}
