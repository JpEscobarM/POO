package br.ucs.poo.trabalho2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Assento implements Serializable{
	private String fileira; // A B C D...
	private int numero; //1 2 3 4 5 6 7...
	private boolean ocupado;
	
	public boolean getOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public Assento() {
		
	}
	public Assento(String fileira, int numero) {
		this.fileira = fileira;
		this.numero = numero;
	}
	public String getFileira() {
		return fileira;
	}
	public void setFileira(String fileira) {
		this.fileira = fileira;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		if(this.ocupado == true) {
			return "[X]";
		}
		if(this.ocupado == false){
			
		return "[]";
		}
		return "";
	}
	
}
