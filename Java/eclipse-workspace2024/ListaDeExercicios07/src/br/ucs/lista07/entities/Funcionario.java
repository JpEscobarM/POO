package br.ucs.lista07.entities;

import br.ucs.lista07.interfaces.Colaborador;

public class Funcionario implements Colaborador{
	
	private float cargaHoraria;
	private String nome;
	
	
	public Funcionario()
	{
		this.cargaHoraria = 8;
	}
	
	@Override
	public float obtemSalario() {
		
		return (this.cargaHoraria()*this.valorHora)*2;
	}

	@Override
	public float cargaHoraria() {
		
		return this.cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString()
	{
		return "Salario:"+this.obtemSalario();
	}
}
