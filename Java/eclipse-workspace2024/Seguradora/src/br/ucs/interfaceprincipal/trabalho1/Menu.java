package br.ucs.interfaceprincipal.trabalho1;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.ucs.entities.trabalho1.Cliente;
import br.ucs.entities.trabalho1.Seguradora;
import br.ucs.entities.trabalho1.Seguro;

public class Menu {
	

	
	public void menuPrincipal () {
		
		int menu = 1;
		Scanner input = new Scanner(System.in);
		
		Seguradora seguradora = new Seguradora();
		
		while(menu != 0) {
			
			System.out.println("============================");
			System.out.println("\tSEGURADORA");
			System.out.println("============================");
			System.out.println("[1] - Cadastrar cliente.");
			System.out.println("[2] - Cadastrar novo seguro para cliente.");
			System.out.println("[3] - Listar seguros cadastrados. ");
			System.out.println("[4] - Listar clientes cadastrados. ");
			System.out.println("[5] - Listar seguros de um cliente.");
			System.out.println("[6] - Consultar seguros com idade menor que 25 anos.");
			System.out.println("[0] - Sair");
			System.out.println("Escolha uma opção: ");

			int opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 0:
				System.out.println("Saindo...");
				menu = 0;
			break; 
				
			case 1:// CADASTRO DE CLIENTE NOVO
				
				try {	

				Cliente cliCadastro = new Cliente();
				System.out.print("Digite o nome: ");
				cliCadastro.setNome(input.nextLine());
				
				System.out.print("CPF: ");
				cliCadastro.setCpf(input.nextLine());
				
				
				System.out.print("--Data de nascimento--\n");
				System.out.print("Dia: ");
				cliCadastro.getDataNascimento().setDia(input.nextInt());
				input.nextLine();
				
				System.out.print("Mes: ");
				cliCadastro.getDataNascimento().setMes(input.nextInt());
				input.nextLine();
				
				System.out.print("Ano: ");
				cliCadastro.getDataNascimento().setAno(input.nextInt());
				input.nextLine();
				
				cliCadastro.calculaIdade();
				
				switch(seguradora.adicionaCliente(cliCadastro)) {
				case 0:
					System.out.println("CPF do cliente já cadastrado no sistema.");
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
				break;
				
				case 1:
					System.out.println("\nCadastro efetuado com sucesso.");
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
				break;
				
				}
				
			
				
				}catch(InputMismatchException i) {
					System.out.println("\nEsse valor não é valido, digite um número novamente.");
				}
			
				
				
			break;

			case 2://CADASTRO DE SEGURO PARA CLIENTE
				//VALOR BASE DO SEGURO É INFORMADO
				//SE O CLIENTE TIVER 25 ANOS DE IDADE OU MENOS O VALOR É ACRESCIDO DE 10% EM CIMA DO VALOR BASE
				//SE O CLIENTE TIVER 40 ANOS DE IDADE OU MAIS HÁ UM DESCONTO DE 15% EM CIMA DO VALOR BASE
				
				System.out.println("Digite o CPF do cliente.");
				String cpfBusca = input.nextLine();
				
				Cliente buscaCli = seguradora.buscaPorCpf(cpfBusca);
				
				if(buscaCli == null) {
					System.out.println("\nCliente não encontrado no sistema, efetue  o cadastro e tentte novamente.");
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
					break;
				}
				System.out.println("Cadastro encontrado.");
				
				Seguro cadastroSeguro = new Seguro();
				cadastroSeguro.setCpfCliente(buscaCli.getCpf());
				
				
				System.out.println("Informe o valor base do seguro: ");
				cadastroSeguro.setValorBase(input.nextDouble());
				input.nextLine();
				
				cadastroSeguro.calculaValorFinal(buscaCli.getIdade());
				
				System.out.println("--Data de vencimento do novo seguro--");
				System.out.print("Dia: ");
				cadastroSeguro.getDataSeguro().setDia(input.nextInt());
				input.nextLine();
				
				System.out.print("Mes: ");
				cadastroSeguro.getDataSeguro().setMes(input.nextInt());
				input.nextLine();
				
				System.out.print("Ano: ");
				cadastroSeguro.getDataSeguro().setAno(input.nextInt());
				input.nextLine();
				
				
				switch(seguradora.adicionaSeguro(cadastroSeguro)) {
				case 0:
					System.out.println("Não foi possível cadastrar o seguro.");
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
				break; 
				case 1:
					System.out.println("\nSeguro efetuado com sucesso.");
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
				break;
				
				}
				
			break;
			
			case 3://LISTAR TODOS SEGUROS CADASTRADOS (APÓLICE, VALOR E NOME DO CLIENTE)
				   
				for (int i = 0 ; i< seguradora.getQtdSeguro(); i ++) {
					Cliente cli = seguradora.buscaPorCpf(seguradora.getSeguro(i).getCpfCliente());
					
					System.out.println(seguradora.getSeguro(i)+"\nCliente: "+ cli.getNome());
				}
				System.out.println("Pressione ENTER para continuar.");
				input.nextLine();
				
			break;
			
			case 4://LISTAR TODOS OS CLIENTES CADASTRADOS(NOME E CPF)
					for (int i = 0 ; i< seguradora.getQtdClientes(); i ++) {
						System.out.println(seguradora.getCliente(i));
					}
					System.out.println("Pressione ENTER para continuar.");
					input.nextLine();
			break;
			
			case 5://LISTAR SEGUROS PARA CLIENTE(NUMERO DA APOLICE E VALOR)
					
			break;
			
			case 6://CONSULTAR SEGUROS DE CLIENTES COM MENOS DE 25 ANOS (NOME E VALOR)
				
			break;
			
			default:
			
				System.out.println("Opção invalida, tente novamente.");
				System.out.println("Pressione ENTER para continuar.");
				
				input.nextLine();
				
			break;
			}
			
			
			
			
		}
		
	}
	
}
