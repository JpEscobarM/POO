package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import exceptions.ClienteJaCadastrado;
import exceptions.ExcecaoDeCarroJaCadastrado;
import model.Carro;
import model.Cliente;
import model.Grande;
import model.LocadoraAutomoveis;
import model.Medio;
import model.Popular;
import persistence.Metadados;

public class InterfaceUsuario {
	
	private static String ARQUIVO = "arquivo.dat";
	
	public static void menu() throws ExcecaoDeCarroJaCadastrado
	{
		Scanner input = new Scanner(System.in);
		int menu = 1;
		
		
		
		LocadoraAutomoveis locadora = null;
		
		try {
		
			locadora = Metadados.carregaArquivo(ARQUIVO);
			
		} catch (FileNotFoundException e) {
			
			e.getMessage();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			
		}
		
		if(locadora == null) // SE NAO TINHA INFORMAÇÕES NO ARQUIVO
		{
			locadora = new LocadoraAutomoveis();
		}
		
		
		
		while(menu != 0 )
		{
			System.out.println("	 ܟLOCADORA DE AUTOMÓVEISܟ	");
			System.out.println("1- Cadastrar Cliente");
			System.out.println("2- Cadastrar Automóvel");
			System.out.println("3- Apresentar Clientes Cadastrados");
			System.out.println("4- Apresentar Automóveis Cadastrados");
			System.out.println("5- Alugar um automóvel");
			System.out.println("6- Devolver um automóvel");
			System.out.println("7- Sair");
			System.out.print("Select: ");
			menu = input.nextInt();
			input.nextLine();
			
			switch(menu)
			{
			
			default:
				System.out.print("Opção inválida, tente novamente.");
				System.out.print("Pressione ENTER para continuar");
				input.nextLine();
			break;
			
			case 1:
			//CADASTRA CLIENTE (NOME E CPF) VERIFICANDO SE JA NÃO HÁ UM CLIENTE CADASTRADO COM O CPF INFORMADO	
			
			System.out.print("Digite o CPF do cliente: ");	
			String newCpf = input.nextLine();
			
			System.out.print("Digite o nome: ");
			String newNome = input.nextLine();
			
			try {
				
				locadora.adicionaCliente(new Cliente(newNome,newCpf));
				
			}catch(ClienteJaCadastrado e)
			{
				System.out.println("Cliente já cadastrado no sistema, tente com um CPF diferente.");
				System.out.println("Pressione ENTER para continuar");
				input.nextLine();
				break;
			}
			
			System.out.println("Cliente adicionado com sucesso.");

			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
				
			break;
			
		
			case 2://CADASTRAR AUTOMOVEL( PLACA, TIPO, ANO DO MODELO E VALOR BASE DA DIARIA)
				//VERIFICANDO SE NÃO HÁ OUTRO AUTOMOVEL CADASTRADO COM A MESMA PLACA
				
				
				System.out.println("digite a placa do veiculo");
				String placa = input.nextLine();
				System.out.println("digite o ano do veiculo");
				int ano=input.nextInt();
				System.out.println("digite o valor base");
				double valor=input.nextDouble();
				System.out.println("defina uma categoria de veiculo para cadastro -1 para  grande -2 para medio -3 popular");
				Carro carro=null;
				int escolha=input.nextInt();
				if(escolha==1) {
					carro=new Grande(placa,"grande",ano,valor,null);
				}else if(escolha==2) {
					 carro=new Medio(placa,"medio",ano,valor,null);
				}else if(escolha==3) {
					  carro=new Popular(placa,"popular",ano,valor,null);
				}else {
					break;
				}
			try {
				locadora.adicionaCarro(carro);
				System.out.println("veiculo adicionado com sucesso");
				break;
			}catch(ExcecaoDeCarroJaCadastrado e) {
				System.out.println("a placa ja esta cadastrada em outro veculo ,tente uma placa diferente");
				System.out.println("Pressione ENTER para continuar");
				input.nextLine();
				
				break;
			
			}

			case 3:
			//APRESENTAR CLIENTES CADASTRADOS
			if(locadora.mostraTodosClientes()!= null)
			{
				System.out.println("Lista de Clientes: ");
				for(Cliente c: locadora.mostraTodosClientes())
				{
					System.out.println(c);
				}
				System.out.println("Pressione ENTER para continuar");
				input.nextLine();
			}
			else
			{
				System.out.println("Lista de clientes vazia.");
				input.nextLine();
			}
				
				
			break;

			case 4://mostrar automóveis cadastrados
				
				if(locadora.mostraTodosCarros()!=null) {
					System.out.println("   veiculos cadastrados\n");
				for(Carro c:locadora.mostraTodosCarros()) {
					System.out.println(c.toString());
				}
				}else {
					System.out.println("nao ha veiculos cadastrados\n");
					input.nextLine();
				}
				
			break;

			case 5:
			//ALUGAR UM AUTOMÓVEL INFORMANDO: CPF DO CLIENTE E NUMERO DE DIAS DE LOCAÇÃO
			// O SISTEMA DEVE APRESENTAR OS AUTOMOVEIS DISPONÍVEIS E O USUÁRIO SELECIONA UM DELES
				
				
			break;

			case 6:
			//DEVOLVER UM AUTOMÓVEL INFORMANDO O NÚMERO DE DIAS DESDE A LOCAÇÃO
			//O SISTEMA DEVE INFORMAR O VALOR A SER PAGO. DIÁRIAS ALÉM DA DATA DE DEVOLUÇÃO
		    //TEM 10% DE ACRESCIMO
				
			break;

			case 7:
			//SAIR
			
			Metadados.salvarNoArquivo(locadora, ARQUIVO);
			
			System.out.println("Obrigado por utilizar nosso sistema!");

			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
			System.out.println("System has been closed.");
			menu = 0;
			
			break;
			
			
			}
			
		}
		
	}
	
}
