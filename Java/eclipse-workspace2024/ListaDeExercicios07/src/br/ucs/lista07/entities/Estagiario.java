package br.ucs.lista07.entities;

import br.ucs.lista07.interfaces.Colaborador;

public class Estagiario implements Colaborador{


	private float cargaHoraria;
	
	public Estagiario()
	{

		this.cargaHoraria = 6;
	}
	
	public float cargaHoraria() {
	
		return this.cargaHoraria;
	}
	
	public float obtemSalario() {
		return this.cargaHoraria*this.valorHora;
	}

}
