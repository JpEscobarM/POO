package model;

import java.io.Serializable;
import java.time.LocalDate;
/**
 * Classe Médio , herdada da classe Carro para tratar de os tipos médios.
 * @author wpsilva
 * @author João
 * @version 20/11/24
 * 
 */
public class Medio extends Carro implements Serializable{
	/**
	 * Método Constutor da Classe Medio.
	 * Implementa os  parâmetros necessários da super classe.
	 * @param placa
	 * @param ano
	 * @param tipo
	 * @param valor
	 */
	
	public Medio(String placa, int ano,double valor) {
		super(placa,"medio", ano, valor);
		
	}
/**
 * Método para calcular o valor base da classe de carro específico de acordo com a idade.
 * Adiciona o desconto de 5% a cada ano do carro com limite total de 15%.
 * @return double com o valor base já calculado.
 */
	@Override
	public double valorBase() {
			int idade=LocalDate.now().getYear()-this.getAno();
			double desconto=idade*0.05;
			if(desconto>0.15) {
				desconto=0.15;
				
			}
			return this.getValorDiaria()*(1-desconto);
		}
	}


