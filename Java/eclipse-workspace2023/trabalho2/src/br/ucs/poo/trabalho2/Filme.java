package br.ucs.poo.trabalho2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Filme	 implements	Serializable{
	private String nome;
	private int ano;
	private String descricao;
	private int nrIngressos = 25;
	public int getNrIngressos() {
		return nrIngressos;
	}
	public void diminuiIngresso() {
		this.nrIngressos -= 1;
	}
	public void setNrIngressos(int nrIngressos) {
		this.nrIngressos = nrIngressos;
	}


	Genero genero = new Genero(); //Todo filme possui um genero
	List <Pessoa> atores= new ArrayList();
	List <Pessoa> diretores= new ArrayList();
	Horario horario;


	public Filme() {

	}
	

	public Filme(String nome, int ano, String descricao) {
		this.nome = nome;
		this.ano = ano;
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "[" + nome + "]";
	}


}
