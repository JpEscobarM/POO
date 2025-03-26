package br.ucs.entities.trabalho1;

import java.util.Random;

public class Seguro {
	
	private int numeroApolice; //PK
	private String cpfCliente; //FK
	private double valorBase ;
	private double valorFinal;
	private Data dataSeguro = new Data();
	Random rand = new Random();
	
	public Seguro() {
		this.numeroApolice = rand.nextInt(99999999);
	}
	
	
	
	//GETTERS AND SETTERS
	public Data getDataSeguro() {
		return dataSeguro;
	}


	public void setDataSeguro(Data dataSeguro) {
		this.dataSeguro = dataSeguro;
	}


	public void setValorBase(double valor) {
		this.valorBase=valor;
	}



	public String getCpfCliente() {
		return cpfCliente;
	}



	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	
	//METODOS
	public void calculaValorFinal(int idadeCliente) {
		if(idadeCliente <= 25) {
			double acrescimo;
			
			acrescimo  = this.valorBase /100;
			acrescimo = acrescimo*10;
			this.valorFinal = this.valorBase+acrescimo;
			
		}
		else if(idadeCliente >= 45) {
			
			double desconto;
			desconto = this.valorBase/100;
			desconto = desconto*15;
			
			this.valorFinal = this.valorBase - desconto;
		}
	}
	
	@Override
	public String toString() {
		return "Apólice: "+this.numeroApolice+"\nValor: "+this.valorFinal;
	}
	
	
}
