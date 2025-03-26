package model;

import java.io.Serializable;
import java.time.LocalDate;
/**
 * Classe Grande , herdada da classe Carro para tratar de os tipos Grandes.
 * @author João
 * @author wpsilva
 * @version 20/11/24
 * 
 */
public class Grande extends Carro implements Serializable{
	
	/**
	 * Método Constutor da Classe Grande.
	 * Implementa os  parâmetros necessários da super classe.
	 * @param placa
	 * @param ano
	 * @param tipo
	 * @param valor
	 */
	
	public Grande(String placa,int ano, double valor) {
		super(placa,"grande",ano, valor);
		
		
	}
	/**
	 *Método para calcular o valor base da classe de carro específico de acordo com a idade .
	 * adiciona o desconto de 7% a cada ano do carro com limite total de 21%
	 * @return double com o valor base já calculado.
	 */
	@Override
	public double valorBase() {
			int idade=LocalDate.now().getYear()-this.getAno();
			double desconto=idade*0.02;
			if(desconto>0.08) {
				desconto=0.08;
				
			}
			return this.getValorDiaria()*(1-desconto);
		}
	}

