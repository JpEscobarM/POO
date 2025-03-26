package br.ucs.entities.academico;

public class Aluno extends Pessoa{
	
	
	private Curso curso = new Curso();
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+"\nCPF: "+this.getCPF()+"\nCurso: "+this.curso.getNome();
	}
}
