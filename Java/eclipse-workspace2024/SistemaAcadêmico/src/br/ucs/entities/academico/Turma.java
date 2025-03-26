package br.ucs.entities.academico;

public class Turma {
	
	private int codigoTurma;
	private String nomeLetra;
	private String horario;
	private Disciplina disciplinaLecionada;
	private Local local = new Local();
	private Aluno[] alunos = new Aluno[50];
	private int qtdAlunos=0;
	
	public int getCodigoTurma() {
		return codigoTurma;
	}
	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	public String getNomeLetra() {
		return nomeLetra;
	}
	public void setNomeLetra(String nomeLetra) {
		this.nomeLetra = nomeLetra;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public void adicionaAluno(Aluno a) {
		this.alunos[qtdAlunos] =a;
		this.qtdAlunos++;
	}
	
	public Disciplina getDisciplinaLecionada() {
		return disciplinaLecionada;
	}
	public void setDisciplinaLecionada(Disciplina disciplinaLecionada) {
		this.disciplinaLecionada = disciplinaLecionada;
	}
	
}
