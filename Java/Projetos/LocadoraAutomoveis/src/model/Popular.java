package model;

import java.io.Serializable;
import java.time.LocalDate;
/**
 * Classe Popular , herdada da classe Carro para tratar de os tipos populares.
 * @author wpsilva
 * @author João
 * @version 20/11/24
 * 
 */
public class Popular extends Carro implements Serializable{
	/**
	 * Método Constutor da Classe Popular.
	 * Implementa os  parâmetros necessários da super classe.
	 * @param placa
	 * @param ano
	 * @param tipo
	 * @param valor
	 */
	
	public Popular(String placa, int ano, double valor) {
		super(placa, "popular", ano, valor);
		
	}
/**
 *Método para calcular o valor base da classe de carro específico de acordo com a idade .
 * adiciona o desconto de 7% a cada ano do carro com limite total de 21%
 * @return double com o valor base já calculado.
 */
@Override
public double valorBase() {
	int idade=LocalDate.now().getYear()-this.getAno();
	double desconto=idade*0.07;
	if(desconto>0.21) {
		desconto=0.21;
		
	}
	return this.getValorDiaria()*(1-desconto);
}
}
