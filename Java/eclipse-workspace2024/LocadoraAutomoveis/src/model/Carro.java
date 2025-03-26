package model;

import java.io.Serializable;

import interfaces.InterfaceVeiculos;

public abstract  class Carro extends Veiculos implements InterfaceVeiculos,Serializable{
	private String tipo;
	private Cliente cliente;
	/**
	 * Método construtor da classe carro.
	 * @param placa
	 * @param tipo
	 * @param ano
	 * @param valor
	 * @param Cliente
	 */
	public Carro(String placa,String tipo , int ano, double valor,Cliente cliente) {
		   super(placa, tipo, ano, valor);
		    this.tipo = tipo;
		}
		public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	 public String toString() {
		return "tipo="+this.getTipo()+" placa= "+this.getPlaca()+" ano= "+this.getAno()+" valor="+this.getValorDiaria();
		 
	 }
	@Override
	public abstract double valorBase() ;
}



