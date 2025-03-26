package br.poo.cursoemvideo.exercicio9.classes;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
//CONSTRUCT:
	public Pessoa(String nome, String sexo, int idade) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
	}
	
	
//GETTERS AND SETTERS:	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
//METODOS:	
	public void fazerAniver() {
		this.idade++;
	}
	
}
