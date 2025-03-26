package br.ucs.br.poo.EnsinoTI.classes;



import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Turma[] turmas = new Turma[30];
		Aluno a = new Aluno();
		Professor p = new Professor();
		int w = 0, opcao = 0, contador = 0;
		int totalAlunos = 0, totalAprovados = 0, porcentagemAprovadosTotal = 0;
		String pausa;

		while (w != 1) {
			System.out.println("----------------------------------");
			System.out.println("	Instituição TI	  ");
			System.out.println("----------------------------------");
			System.out.println("1)Listar todas as turmas");
			System.out.println("2)Informar dados de uma turma");
			System.out.println("3)Consultar os dados de uma turma");
			System.out.println("4)Consultar estatisticas gerais");
			System.out.println("5)Sair do sistema");
			opcao = input.nextInt();
			switch (opcao) {

			case 1:
				if(turmas[contador] == null) {
					System.out.println("Nenhuma turma regisrada no sistema!");
				}
				input.nextLine();
				int i;
				System.out.println("---------LISTAGEM DE TURMAS----------");
				for (i = 0; i < contador; i++) {
					
					if (turmas[i].getCodigo() == 1) {
						System.out.println("Código 1: Ciência da Computação");
					}
					if (turmas[i].getCodigo() == 2) {
						System.out.println("Código 2: Engenharia de Software");
					}
					if (turmas[i].getCodigo() == 3) {
						System.out.println("Código 3: Engenharia de Computação");
					}
					if (turmas[i].getCodigo() == 4) {
						System.out.println("Código 4: Análise e Desenvolvimento de Sistemas");
					}
					System.out.println("Disciplina: " + turmas[i].getDisciplina().getNome());
					System.out.println("Professor: " + turmas[i].getProfessor().getNome());
					System.out.println("Total de alunos: " + turmas[i].getDisciplina().getContador());
					System.out.println("-------------------\n");
				}
				input.nextLine();
				break;
			case 2:
				turmas[contador] = new Turma();
				// input.nextLine();
				System.out.println("--Cursos Disponiveis--");
				System.out.println("Código 1: Ciência da Computação");
				System.out.println("Código 2: Engenharia de Software");
				System.out.println("Código 3: Engenharia de Computação");
				System.out.println("Código 4: Análise e Desenvolvimento de Sistemas\n");
				System.out.println("Digite o número codigo da turma referente ao curso: ");// FBI00001AX
				turmas[contador].setCodigo(input.nextInt());
				input.nextLine();
				System.out.println("Digite o nome da disciplina: ");
				Disciplina d = new Disciplina();
				d.setNome(input.nextLine());
				// input.nextLine();
				turmas[contador].setDisciplina(d);
				System.out.println("Digite o nome do professor: ");
				p.setNome(input.nextLine());
				turmas[contador].setProfessor(p);
				// input.nextLine();
				int opc = 0;
				while (opc != 1) {
					System.out.println("Digite o número da matrícula do aluno: ");
					a.setId(input.nextLine());
					// input.nextLine();
					System.out.println("Nome do aluno: ");
					a.setNome(input.nextLine());
					// input.nextLine();
					System.out.println("Digite o email do aluno: ");
					a.setEmail(input.nextLine());
					// input.nextLine();
					System.out.println("Digite as três notas do aluno: ");
					System.out.print("Nota 1: ");
					a.setNota1(input.nextDouble());
					input.nextLine();
					System.out.print("Nota 2: ");
					a.setNota2(input.nextDouble());
					input.nextLine();
					System.out.print("Nota 3: ");
					a.setNota3(input.nextDouble());
					input.nextLine();
					a.calculaAprovacao(a);
					if (a.getAprovado()) {

						turmas[contador].getDisciplina().setContadorAprovados(1);
					}

					turmas[contador].getDisciplina().setAlunos(a);

					System.out.println("Deseja continuar adicionando alunos na turma? [S]-Sim [N]-Não");
					String c = input.nextLine();
					if (c.equalsIgnoreCase("s") && turmas[contador].getDisciplina().getContador() < 29) {

					} else if (c.equalsIgnoreCase("n")) {
						opc = 1;

					} else {
						System.out.println("Opção invalida!");
					}
					
				} // while
				//input.nextLine();
				contador++;
				break;

			case 3:
				input.nextLine();
				System.out.println("Digite o nome da disciplina para receber informações da turma: ");
				String nome = input.nextLine();
				//input.nextLine();
				for (i = 0; i < contador; i++) {
					//System.out.println("----------------");
					if (turmas[i].getDisciplina().getNome().equalsIgnoreCase(nome)) {
						if (turmas[i].getCodigo() == 1) {
							System.out.println("Código 1: Ciência da Computação");
						}
						if (turmas[i].getCodigo() == 2) {
							System.out.println("Código 2: Engenharia de Software");
						}
						if (turmas[i].getCodigo() == 3) {
							System.out.println("Código 3: Engenharia de Computação");
						}
						if (turmas[i].getCodigo() == 4) {
							System.out.println("Código 4: Análise e Desenvolvimento de Sistemas");
						}

						System.out.println("Disciplina: " + turmas[i].getDisciplina().getNome());
						System.out.println("Professor: " + turmas[i].getProfessor().getNome());
						System.out.println("------Alunos------ ");
						int j;
						for (j = 0; j < turmas[i].getDisciplina().getContador(); j++) {
							System.out.println("Nome: " + turmas[i].getDisciplina().alunos[j].getNome());
							System.out.println("Nota 1: " + turmas[i].getDisciplina().alunos[j].getNota1());
							System.out.println("Nota 2: " + turmas[i].getDisciplina().alunos[j].getNota2());
							System.out.println("Nota 3: " + turmas[i].getDisciplina().alunos[j].getNota3());
							System.out.println("Média Final: " + turmas[i].getDisciplina().alunos[j].getMediaFinal());
							if (turmas[i].getDisciplina().alunos[j].getAprovado()) {
								System.out.println("Situação final: Aprovado.");
							} else {
								System.out.println("Situação final: reprovado.");
							}
						}
					}
					System.out.println("----------------");

				}

				input.nextLine();
				break;

			case 4:
				input.nextLine();
				try {
				for (i = 0; i < contador; i++) {
					System.out.println("----------------");
					totalAlunos += turmas[i].getDisciplina().getContador();
					totalAprovados += turmas[i].getDisciplina().getContadorAprovados();
					if (turmas[i].getCodigo() == 1) {
						System.out.println("Código 1: Ciência da Computação");
					}
					if (turmas[i].getCodigo() == 2) {
						System.out.println("Código 2: Engenharia de Software");
					}
					if (turmas[i].getCodigo() == 3) {
						System.out.println("Código 3: Engenharia de Computação");
					}
					if (turmas[i].getCodigo() == 4) {
						System.out.println("Código 4: Análise e Desenvolvimento de Sistemas");
					}
					System.out.println("Disciplina: " + turmas[i].getDisciplina().getNome());
					System.out.println("Professor: " + turmas[i].getProfessor().getNome());
					System.out.println("Total de alunos da truma: " + turmas[i].getDisciplina().getContador());
					int porcentagem = (turmas[i].getDisciplina().getContadorAprovados() * 100)
							/ turmas[i].getDisciplina().getContador();
					System.out.println("Quantidade de aprovados: " + turmas[i].getDisciplina().getContadorAprovados());
					System.out.println("Porcentagem de aprovação da turma: " + porcentagem + "%");
					System.out.println("----------------");
				}
				System.out.println("--ESTATISICAS GERAIS DA INSTITUIÇÃO--");
				porcentagemAprovadosTotal = (totalAprovados * 100) / totalAlunos;
				System.out.println("O número total de alunos matriculados é: " + totalAlunos);
				System.out.println("Total de aprovação da instituição: " + porcentagemAprovadosTotal + "%");
				input.nextLine();
				break;
				}catch(RuntimeException e) {
					System.out.println("É preciso registrar uma turma para consultar as estatísticas gerais. ");
				}
			case 5:
				System.out.println("Obrigado por utilizar o nosso sistema!");
				w = 1;
				break;

			default:
				System.out.println("Opção invalida!");
			}
		}

	}// Main
}// classe
