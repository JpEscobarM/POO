package br.ucs.lista07.entities;

import br.ucs.lista07.interfaces.Professor;

public class ProfessorTecnico implements Professor{

	private String titulacao;
	private float cargaHoraria;
	private float adicionalTitulacao;
	private float salarioInicial;
	
	
	
	public ProfessorTecnico()
	{
		this.titulacao = "Graduacao";
		this.cargaHoraria = 8;
		this.salarioInicial = this.cargaHoraria*this.valorHora;
	}
	
	@Override
	public String obtemTitulacao() {
		
		return this.titulacao;
	}

	@Override
	public void setTitulacao(String t) {
	
		this.titulacao = t;
	}



	@Override
	public float obtemSalario() {
		
		if(this.titulacao.equalsIgnoreCase("Graduacao"))
		{
		
		return this.cargaHoraria()*this.valorHora*3;
		}
		else if(this.titulacao.equalsIgnoreCase("Mestrado"))
		{
			
			return (float) ((this.cargaHoraria()*this.valorHora*3)*(salarioInicial*0.20));
		}
		else
		{
			return (float) ((this.cargaHoraria()*this.valorHora*3)*(salarioInicial*0.50));
		}
		
	}

	@Override
	public float cargaHoraria() {
		
		return this.cargaHoraria;
	}


	
}
