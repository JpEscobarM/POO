package br.ucs.entities.academico;

public class Disciplina {
	private int codigoDisciplina;
	private String nome;
	private Curso pertenceAoCurso = new Curso();
	
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getPertenceAoCurso() {
		return pertenceAoCurso;
	}
	public void setPertenceAoCurso(Curso pertenceAoCurso) {
		this.pertenceAoCurso = pertenceAoCurso;
	}
	
	
}
