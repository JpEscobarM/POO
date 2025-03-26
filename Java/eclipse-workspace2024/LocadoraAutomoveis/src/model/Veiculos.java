package model;

import java.io.Serializable;

public abstract class   Veiculos implements Serializable{
//String tipo;
private String placa ;
private int ano;
private double valorDiaria;
private String tipo;



public String getTipo() {
	return tipo;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
}



public void setValorDiaria(float valorDiaria) {
	this.valorDiaria = valorDiaria;
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



public Veiculos(String placa,String tipo ,int ano, double valor) {
	this.placa=placa;
	this.ano=ano;
	this.valorDiaria=valor;
}




}
