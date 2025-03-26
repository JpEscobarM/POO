package model;

import java.io.Serializable;
/**
 * Classe Cliente, para implementar as os objetos instanciados do tipo Cliente.
 * @author João
 * @author wpsilva
 * @version 20/11/24
 */
public class Cliente implements Serializable{
		
	private String nome;
	private String cpf;
	
	
		
/**
 * Método construtor da Classe Cliente.
 * Recebe os argumentos para realização de cadastro.
 * @param nome
 * @param cpf
 */
	public Cliente(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	//Métodos acessores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//Métodos implementados

	
	
	@Override
	public String toString()
	{
		return "Nome: "+this.getNome()+" CPF: " + this.getCpf();
	}
}
