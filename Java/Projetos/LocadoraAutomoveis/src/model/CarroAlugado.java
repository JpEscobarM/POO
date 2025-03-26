package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *  Classe utilizada para gerenciar os o aluguel de um carro.
 * @author João
 * @author wpsilva
 *  @version 20/11/24
 *   
 */
public class CarroAlugado implements  Serializable  {

private Cliente cliente;
private Carro carro;
private LocalDate inicioAluguel,fimAluguel,dataDevolucao;
private double valorFinal;
private long diastotais;
//CONSTRUTOR
/**
 * Métodoo para um objeto um cliente alugar um carro definindo o número de dias.
 * @param carro
 * @param cliente
 * @param dias
 * @return true se a locacão foi bem sucedida.
 * @return false se algo deu errado na locação.
 */
public CarroAlugado(Carro carro,Cliente cliente , LocalDate inicio, LocalDate fim){
  
	this.inicioAluguel = inicio;
	this.fimAluguel = fim;
   carro.setDisponivel(false);
   this.carro=carro;
   this.cliente=cliente;

   
	}

//métodos acessores


public Carro getCarro() {
	return this.carro;
}





public double getValorFinal() {
	return valorFinal;
}


public void setValorFinal(double valorFinal) {
	this.valorFinal = valorFinal;
}


public Cliente getCliente() {
	return cliente;
}


public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}


public void setCarro(Carro carro) {
	this.carro = carro;
}








//Métodos implementados
/**
 

/**
 * Metodo para devolução de um carro .
 * disponibiliza as informações relacionadas a um veículo que foi alugado.
 * @param carro
 * @param diasDevolucao
 */ 
public void  devolverUmCarro(Carro carro, LocalDate dataDevolucao) {
	this.diastotais = ChronoUnit.DAYS.between(this.inicioAluguel, dataDevolucao);
	double valor=carro.getValorDiaria()*diastotais;
	if(dataDevolucao.isAfter(this.fimAluguel)) {
		valor=valor*1.10;
	}
	this.setValorFinal(valor);
	

	carro.setDisponivel(true);
}






@Override
public String toString() {
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   DecimalFormat df = new DecimalFormat("#.00");
	return "\nVigencia do contrato: "+this.inicioAluguel.format(formatter)+" - "+ this.fimAluguel.format(formatter)+
			"\nValor total:R$"+df.format(this.getValorFinal())+"\nquantidade de dias: "+this.diastotais;
	}




}
