package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Popular extends Carro implements Serializable{
	public Popular(String placa, String tipo, int ano, double valor,Cliente cliente) {
		super(placa, tipo, ano, valor,cliente);
		// TODO Auto-generated constructor stub
		
	}
/**
 * Método para calcular o valor base de acordo com o modelo e a idade do veículo, limitando a 21%
 * @return a o valor do veículo de acordo com o calculo.
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
