package model;

import java.io.Serializable;

/**
 * Classe abstrata para representar veículos do tipo carro.
 * @author João
 * @author wpsilva
 * @version 20/11/2024
 * 
 */
public abstract  class Carro extends Veiculos implements Serializable{
	private boolean disponivel=true;

	private String tipo;
	/**
	 * Método construtor da classe carro.
	 * @param placa
	 * @param tipo
	 * @param ano
	 * @param valor
	 * @param Cliente
	 */
	public Carro(String placa,String tipo , int ano, double valor) {
		   super(placa , ano, valor);
		   this.setTipo(tipo);
		    
		}
		
	
	//Métodos acessores
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
// métodos implementados
	
	/**
	 * Representação da Classe Carro, informando os detalhes específicos de cada veículo.
	 * @return String com as informações. 
	 */
	@Override
	 public String toString() {
		return "Categoria: "+this.getTipo()+"\nPlaca: "+this.getPlaca()+"\nAno: "+this.getAno()+"\nvalor da diaria= "+this.getValorDiaria()+
				"\n"+"disponivel :"+this.isDisponivel();
		 
	 }
	@Override
	public abstract double valorBase() ;
}



