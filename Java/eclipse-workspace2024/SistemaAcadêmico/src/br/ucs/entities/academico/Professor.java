package br.ucs.entities.academico;

public class Professor extends Pessoa{
	
	private String departamento;
	
	
	//CONSTRUCTOR
	public Professor() {
		
	}
	
	public Professor(String cpf, String nome, String endereco, String departamento) {
		
		this.setCPF(cpf);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setDepartamento(departamento);
		
		
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override 
	public String toString() {
		
		return "Nome: "+this.getNome()+"\nDepartamento: "+this.departamento;
	}
}
