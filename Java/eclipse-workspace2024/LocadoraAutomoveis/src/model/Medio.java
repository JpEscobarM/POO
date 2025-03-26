package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Medio extends Carro implements Serializable{
	public Medio(String placa, String tipo, int ano, double valor,Cliente cliente) {
		super(placa, tipo, ano, valor,cliente);
		// TODO Auto-generated constructor stub
		
	}
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


