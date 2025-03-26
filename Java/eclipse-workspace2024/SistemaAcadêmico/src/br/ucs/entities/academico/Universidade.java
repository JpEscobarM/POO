package br.ucs.entities.academico;

public class Universidade {
	
	private String nome;
	private String endereco;
	
	private Curso[] ListaCursos = new Curso[15];
	private int qtdCursos = 0;
	
	private Aluno[] ListaAlunos = new Aluno[500];
	private int qtdAlunos = 0;
	
	private Turma[] ListaTurma = new Turma[200];
	private int qtdTurmas=0;
	
	private Professor[] ListaProfessores = new Professor[50];
	private int qtdProfessores=0;
	
	private Local[] blocos = new Local[5];
	
	
	
	//CONSTRUTOR
	public Universidade() {
		
	this.nome ="Universidade de Caxias do Sul"; 
	this.endereco = "R. Francisco Getúlio Vargas, 1130 - Petrópolis, Caxias do Sul - RS, 95070-560";

	
	for (int i = 0; i < 5; i++) {
		Local bloco1 = new Local();
		bloco1.setNomeBloco("Bloco");
		bloco1.setNumeroBloco(i);
		
		blocos[i] = bloco1;
	}
	
	this.iniciaCursos();
	this.iniciaProfessores();
	
	}
	
	
	public void setBloco(Local bloco,int pos) {
		this.blocos[pos] = bloco;
	}
	

	public Curso getCurso(int num) {
		
		for(int i = 0 ; i < this.qtdCursos; i++) {
			if(ListaCursos[i].getCodigoCurso() == num) {
				return ListaCursos[i];
			}
		}
		
		return null;
	}
	
	public void adicionaProfessor(Professor p) {
		this.ListaProfessores[this.qtdProfessores] = p;
		this.qtdProfessores++;
	}
	
	public void adicionaCurso(Curso c) {
		ListaCursos[qtdCursos] = c;
		qtdCursos++;
	}
	
	
	public void matriculaAluno(Aluno a) {
		this.ListaAlunos[qtdAlunos]=a;
		this.qtdAlunos++;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public Turma[] getListaTurma() {
		return ListaTurma;
	}
	public void setListaTurma(Turma[] listaTurma) {
		ListaTurma = listaTurma;
	}
	public int getQtdTurmas() {
		return qtdTurmas;
	}
	public void setQtdTurmas(int qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
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
	
	
	
	//METODOS DE INICIAÇÂO PADRAO
	
	public void iniciaCursos() {
		Curso iniciaCurso1 = new Curso();
		int numeroDoCurso = 1;
		iniciaCurso1.setNome("Medicina");
		iniciaCurso1.setCodigoCurso(numeroDoCurso);
		this.adicionaCurso(iniciaCurso1);
		numeroDoCurso++;
		
		
		Curso iniciaCurso2 = new Curso();
	
		iniciaCurso2.setNome("Direito");
		iniciaCurso2.setCodigoCurso(numeroDoCurso);
		this.adicionaCurso(iniciaCurso2);
		numeroDoCurso++;
		
		Curso iniciaCurso3 = new Curso();
		iniciaCurso3.setNome("Administração");
		iniciaCurso3.setCodigoCurso(numeroDoCurso);
		this.adicionaCurso(iniciaCurso3);
		numeroDoCurso++;
		
		Curso iniciaCurso4 = new Curso();
		iniciaCurso4.setNome("Engenharia");
		iniciaCurso4.setCodigoCurso(numeroDoCurso);
		this.adicionaCurso(iniciaCurso4);
		numeroDoCurso++;
		
		Curso iniciaCurso5 = new Curso();
		iniciaCurso5.setNome("Ciência da Computação");
		iniciaCurso5.setCodigoCurso(numeroDoCurso);
		this.adicionaCurso(iniciaCurso5);
		numeroDoCurso++;
		
		
		
	}
	
	public void iniciaProfessores() {
		this.adicionaProfessor(new Professor("948.540.120-56" ,"Michael M. Huff" ,"Rua Avenida Desembargador Moreira - Bairro Aldeota - CE" ,"Exatas"));
		this.adicionaProfessor(new Professor("836.480.050-73" ,"Christine J. Earl" ,"Rua da Imprensa - Bairro Monte Castelo - MS" ,"Técnologia da Informação"));
		this.adicionaProfessor(new Professor("038.967.140-15" ,"Lora D. Small" ,"Rua Carazinho - Bairro São Francisco - RS" ,"Direito"));
		this.adicionaProfessor(new Professor("648.988.200-00" ,"James K. Horn" ,"Rua do Desembargador - Bairro São Francisco - RS" ,"Saúde"));
		this.adicionaProfessor(new Professor("994.566.700-90" ,"Karin M. Andrews" ,"Rua	Praça da República - Bairro República - SP " ,"Saúde"));
	}
	
	//METODOS DE IMPRESSAO
	public void imprimirProfessores() {
		for(int i = 0; i<this.qtdProfessores;i++) {
			System.out.println(this.ListaProfessores[i]+"\n");
		}
	}
		
	public void imprimirCursos() {
		for(int i = 0; i<this.qtdCursos;i++) {
			System.out.println(this.ListaCursos[i]+"\n");
		}
	}
	
}
