package br.ucs.entities.trabalho1;

public class Cliente {
	
	private String cpf;
	private Data dataNascimento = new Data();
	private String nome;
	private int idade;
	private String endereco;
	
	public Cliente() {
		
	}
	//GETTERS AND SETTERS
	public int getIdade() {
		return this.idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//METODOS
	public void calculaIdade() {
		this.idade = 2024 -this.dataNascimento.getAno();
	}
	
    @Override
    public String toString() {
    	return "Nome: "+this.nome+"\nCPF: "+this.cpf;
    }
}
