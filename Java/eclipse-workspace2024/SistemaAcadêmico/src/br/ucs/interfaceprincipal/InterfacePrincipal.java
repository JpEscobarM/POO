package br.ucs.interfaceprincipal;

import java.util.Scanner;

import br.ucs.entities.academico.Aluno;
import br.ucs.entities.academico.Universidade;

public class InterfacePrincipal {
	
	
	private Universidade universidade = new Universidade();
	Scanner input = new Scanner(System.in);
	
	public void menu() {
		
		int menu =1;
		
		
		
		while(menu !=0) {
			System.out.println("==============================================================================");
			System.out.println("\t\t\t"+universidade.getNome());
			System.out.println(universidade.getEndereco());
			System.out.println("==============================================================================");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar Aluno");
			int op= input.nextInt();
			input.nextLine();
			
			switch(op) {
			case 1:
				Aluno alunoCadastro = new Aluno();
				System.out.print("\t--CADASTRO DE ALUNO--\n");
				System.out.print("Digite o nome do aluno: ");
				alunoCadastro.setNome(input.nextLine());
				
				System.out.print("Digite o CPF: ");
				alunoCadastro.setCPF(input.nextLine());
				
				System.out.print("Digite o endereço: ");
				alunoCadastro.setEndereco(input.nextLine());
				
				System.out.println("\n\n--Lista de Cursos Disponíveis-- ");
				universidade.imprimirCursos();
				
				System.out.print("Escolha um curso pelo código: ");
				int numeroCurso = input.nextInt();
				input.nextLine();
				
				alunoCadastro.setCurso(universidade.getCurso(numeroCurso));
				
				universidade.matriculaAluno(alunoCadastro);
				
				System.out.println("Aluno matriculado.");
				System.out.println(alunoCadastro);
				
				break;
			
			case 0:
				System.out.println("Saindo...");
				menu=0;
				break;
			default:
				System.out.println("opção invalida.");
				break;			
			
			
			}
			
		}
	}
	
}
