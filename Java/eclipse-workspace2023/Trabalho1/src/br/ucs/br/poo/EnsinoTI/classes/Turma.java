package br.ucs.br.poo.EnsinoTI.classes;

public class Turma {
	private int codigo;
	private Professor professor;
	private Disciplina disciplina;
	
	
	public Turma( ) {

	}
	
	public Turma(int c, Professor p, Disciplina d ) {
		this.setCodigo(c);
		this.setProfessor(p);
		this.setDisciplina(d);
	}
	
	public void regAluno() {
		
	
	}
//G and S:
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}
	

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	
	
}
