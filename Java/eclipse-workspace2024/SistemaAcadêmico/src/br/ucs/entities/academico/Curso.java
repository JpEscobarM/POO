package br.ucs.entities.academico;

public class Curso {
	
	private String nome;
	private int codigoCurso;
	
	Disciplina[] ListaDisciplinas = new Disciplina[50];
	int qtdDisciplinas = 0 ;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@Override
	public String toString() {
		
		return "["+this.nome+" || Código:"+this.codigoCurso+"]";
	}
}
