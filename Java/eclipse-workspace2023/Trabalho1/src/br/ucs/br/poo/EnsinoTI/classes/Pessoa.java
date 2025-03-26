package br.ucs.br.poo.EnsinoTI.classes;


public abstract class Pessoa {
	protected String nome;
	protected String email;
	protected String id; //codigo do aluno
	
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
 	
}
