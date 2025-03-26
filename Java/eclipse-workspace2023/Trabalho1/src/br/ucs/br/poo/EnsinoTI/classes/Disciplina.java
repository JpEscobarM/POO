package br.ucs.br.poo.EnsinoTI.classes;

public class Disciplina {
	private String nome;
	private double mediaAprovacao;
	private Aluno aluno;
	private int contador = 0;
	private  int  contadorAprovados=0;
	


	public Disciplina () {
	
	}
	
	public int getContadorAprovados() {
		return this.contadorAprovados;
	}

	public void setContadorAprovados(int contadorAprovados) {
		this.contadorAprovados++;
	}

	Aluno[] alunos = new Aluno[30];
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaAprovacao() {
		return mediaAprovacao;
	}

	public void setMediaAprovacao(double mediaAprovacao) {
		this.mediaAprovacao = mediaAprovacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
//vetor de alunos da disciplina: 

	
	public Aluno[] getAlunos() {
		
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos[contador]=aluno;
		this.contador++;
	}
	
	
	public int getContador() {
		return this.contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}


	
}
