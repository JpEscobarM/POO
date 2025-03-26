package model;

import java.io.Serializable;

import interfaces.InterfaceVeiculos;
/**
 * Classe abstrata para cadastro de veículos.
 * @author João
 * @author wpsilva
 * @version 20/11/2024
 */
public abstract class   Veiculos implements InterfaceVeiculos,Serializable{
private String placa ;
private boolean disponivel;
private int ano;
private double valorDiaria;




public boolean isDisponivel() {
	return disponivel;
}



public void setDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
}





public String getPlaca() {
	return placa;
}



public void setPlaca(String placa) {
	this.placa = placa;
}



public int getAno() {
	return ano;
}



public void setAno(int ano) {
	this.ano = ano;
}



public double getValorDiaria() {
	return valorDiaria;
}



public void setValorDiaria(double valor) {
	this.valorDiaria = valor;
}


/**
 * Construtor da Classe Veiculos.
 * @param placa argumento para a placa do veículo .
 * @param tipo	argumento para o tipo de veiculo.
 * @param ano Argumento para o ano do  veículo.
 * @param valor Argumento para o valor da diária do veículo.
 */
public Veiculos(String placa,int ano, double valor) {
	this.placa=placa;
	this.ano=ano;
	this.valorDiaria=valor;
}




}
