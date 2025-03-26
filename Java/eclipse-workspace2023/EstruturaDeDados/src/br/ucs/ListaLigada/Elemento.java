package br.ucs.ListaLigada;

public class Elemento {
	
	private String valor;
	private Elemento proximo;
	
	public Elemento() {
		
	}
	public Elemento(String val) {
		this.valor=val;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public String toString() {
		return " "+this.valor;
	}
}
