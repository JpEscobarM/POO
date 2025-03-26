package br.ucs.br.poo.EnsinoTI.classes;

public class Aluno extends Pessoa{
	private int curso;
	private double nota1,nota2,nota3;
	private double mediaFinal;
	private boolean aprovado;
		
public Aluno() {
	
}
	
public int getCurso() {
		return curso;
	}

public void setMediaFinal(double n) {
	this.mediaFinal =  n;
}
public double getMediaFinal() {
	return this.mediaFinal;
}

	public void setCurso(int curso) {
		this.curso = curso;
	}



	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}



	public double getNota2() {
		return nota2;
	}



	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}



	public double getNota3() {
		return nota3;
	}



	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}



	public boolean getAprovado() {
		return aprovado;
	}



	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	
	//calcula media do aluno:
	public void calculaAprovacao(Aluno a) {
		 mediaFinal = 0;
		mediaFinal+= a.getNota1() + a.getNota2() + a.getNota3();
		this.setMediaFinal(mediaFinal/3);
		if ( this.getMediaFinal() >= 7) {
			a.setAprovado(true);
		}
		else if ( this.getMediaFinal() < 7) {
			a.setAprovado(false);
		}
			
		
	}
	
}
