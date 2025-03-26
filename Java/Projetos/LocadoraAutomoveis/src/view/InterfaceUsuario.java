package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import exceptions.ExcecaoClienteJaCadastrado;
import exceptions.ExcecaoDataInvalida;
import exceptions.ExcecaoDeCarroJaCadastrado;
import exceptions.ExcecaoNenhumCarroAlugado;
import exceptions.ExcecaoNenhumCarroDisponivel;
import exceptions.ExcecaoNenhumClienteCadastrado;
import model.Carro;
import model.CarroAlugado;
import model.Cliente;
import model.Grande;
import model.LocadoraAutomoveis;
import model.Medio;
import model.Popular;
import persistence.LocadoraAutomoveisSerializacaoDAO;


public class InterfaceUsuario {
	
	private static String ARQUIVO = "arquivo.dat";
	
	public static void menu()
	throws ExcecaoDeCarroJaCadastrado,
	ExcecaoNenhumCarroDisponivel,
	ExcecaoNenhumClienteCadastrado,
	ExcecaoNenhumCarroAlugado,
	ExcecaoDataInvalida
	{
		Scanner input = new Scanner(System.in);
		int menu = 1;
		
		LocadoraAutomoveisSerializacaoDAO persistencia = new LocadoraAutomoveisSerializacaoDAO() ;
		
		LocadoraAutomoveis locadora = null;
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
			locadora = persistencia.carregaArquivo(ARQUIVO);
			
	
		
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
			System.out.print("Select: \n");
			menu = input.nextInt();
		
			input.nextLine();
			
			switch(menu)
			{
			
		
			case 1:
			//CADASTRA CLIENTE (NOME E CPF) VERIFICANDO SE JA NÃO HÁ UM CLIENTE CADASTRADO COM O CPF INFORMADO	
				System.out.print("CADASTRO DE CLIENTE\n");
			System.out.print("Digite o CPF do cliente: ");	
			String newCpf = input.nextLine();
			
			System.out.print("Digite o nome: ");
			String newNome = input.nextLine();
			
			try {
				
				locadora.adicionaCliente(new Cliente(newNome,newCpf));
				
			}catch(ExcecaoClienteJaCadastrado e)
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
				System.out.print("CADASTRO DE VEICULO\n");
				Carro carro=null;
				System.out.println("digite a placa do veiculo");
				String placa = input.nextLine();
				System.out.println("digite o ano do veiculo");
			
				int ano=input.nextInt();
				System.out.println("digite o valor base");
				double valor=input.nextDouble();
				System.out.println("defina uma categoria de veiculo para cadastro\n-1 para grande \n-2 para medio \n-3 popular");
				
				int escolha=input.nextInt();
				if(escolha==1) {
					carro=new Grande(placa,ano,valor);
				}else if(escolha==2) {
					 carro=new Medio(placa,ano,valor);
				}else if(escolha==3) {
					  carro=new Popular(placa,ano,valor);
				}else {
					System.out.println("opcao invalida\n Pressione ENTER para continuar\"");
					break;
				}
			try {
				locadora.adicionaCarro(carro);
				System.out.println("veiculo adicionado com sucesso");
				input.nextLine();
				
			}catch(ExcecaoDeCarroJaCadastrado e) {
				System.out.println("a placa ja esta cadastrada em outro veculo ,tente uma placa diferente");
				System.out.println("Pressione ENTER para continuar");
				input.nextLine();
				input.nextLine();
				break;
				
			}
			
			System.out.println("Pressione ENTER para continuar");
			
				input.nextLine();
				break;
			

			case 3:
		//APRESENTAR CLIENTES CADASTRADOS
				System.out.print("CLIENTES CADASTRADOS\n");
		try {
				
				for(Cliente c: locadora.mostrarClientes())
				{
					System.out.println(c);
				}
		}catch(ExcecaoNenhumClienteCadastrado e) {
					System.out.println("lista de clientes vazia");
					
				}
				
			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
			break;

			case 4://mostrar automóveis cadastrados
				System.out.print("VEICULOS CADASTRADOS\n");
					try{
				for(Carro c:locadora.mostraTodosCarros()) {
					System.out.println(c+"\n");
				}
				}catch(ExcecaoNenhumCarroDisponivel e) {
					System.out.println("nenhum veiculo disponivel para exibicao");
				
				}


					System.out.println("Pressione ENTER para continuar");
					input.nextLine();
			break;

			case 5:
			//ALUGAR UM AUTOMÓVEL INFORMANDO: CPF DO CLIENTE E NUMERO DE DIAS DE LOCAÇÃO
			// O SISTEMA DEVE APRESENTAR OS AUTOMOVEIS DISPONÍVEIS E O USUÁRIO SELECIONA UM DELES
				System.out.print("ALUGANDO UM VEICULO \n");
				System.out.println("digite o cpf do cliente ");
				String cpf=input.nextLine();
				Cliente cliente=locadora.BuscarCliente(cpf);
				if(cliente==null) {
					System.out.println("cliente nao encontrado");
					break;
				}
				System.out.println("cliente localizado, digite a data que deseja retirar o veículo(dd/mm/aaaa): ");
				
				String diaInicio = input.nextLine().trim();
				
				
				System.out.println("Digite a data entrega do veículo(dd/mm/aaaa): ");
				String diaFim = input.nextLine().trim();
				try {	
				//DATA DE INICIO E FIM PARA OBTER A QUANTIDADE DE DIAS ALUGADOS
				LocalDate dataInicio =  LocalDate.parse(diaInicio, formatter);
				LocalDate dataFim = LocalDate.parse(diaFim, formatter);
				if(dataInicio.isAfter(dataFim)) {
					System.out.println("Periodo invalido!A data final nao pode ser anterior a data inicial.\nPressione ENTER para continuar");
					input.nextLine();
					break;
				}
				 
				int i=0;
			
					   List<Carro> carrosDisponiveis = locadora.buscarCarrosDisponiveis();
					   
					for(Carro c:carrosDisponiveis) {
						System.out.println("\n\t["+i+"]\n"+c.toString());
						i++;
					}
						System.out.println("digite o indice do veiculo escolhido");   
						
						 escolha =input.nextInt();
						 input.nextLine();
						 
						 if(escolha>=0 && escolha < carrosDisponiveis.size()) {
								 carro=carrosDisponiveis.get(escolha);
									CarroAlugado carroAlugado=new CarroAlugado(carro,cliente,dataInicio,dataFim);
									locadora.adicionarNovoAlugado(carroAlugado);
									
									System.out.println("carro alugado com sucesso");
									
									
									System.out.println("Pressione ENTER para continuar");
									input.nextLine();
									
							
							
							}else {
								System.out.println("houve um erro durante a locacao ,favor tente novamente");
								break;
							}
						
					
				} catch (DateTimeParseException e) {
		            System.out.println("Formato de data inválido! Tente novamente usando o formato dd/MM/AAAA.\nPressione ENTER para continuar" );
		            input.nextLine();
		            break;
		        
				  }catch(ExcecaoNenhumCarroDisponivel e) {
					System.out.println("não ha carros disponiveis\nPressione ENTER para continuar");
					  input.nextLine();
					break;
				}
					
				break;
			
				
			case 6:
				LocalDate dataDevolucao ;
			System.out.println("DEVOLUCAO DE VEICULO\n");
			System.out.println("digite a placa do do veiculo:");
			placa=input.nextLine();
			try {
			 carro=locadora.buscarCarro(placa);
			CarroAlugado ca=locadora.buscarContratoAlugado(carro);
			
			if(ca == null) {
			System.out.println("Veículo nao encontrado.");
			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
			break;
			
			}
			
			System.out.println("Informacoes do contrato:");	
			System.out.println(ca.getCarro()+"\n"+ca.getCliente());
			try {
			System.out.println("digite a data de devolucao:");
			
			String diaDevolucao = input.nextLine().trim();
			
			
			 dataDevolucao = LocalDate.parse(diaDevolucao, formatter);
		
			 ca.devolverUmCarro(ca.getCarro(), dataDevolucao);
			 System.out.println(ca);
		
			} catch (DateTimeParseException e) {
	            System.out.println("Formato de data inválido! Tente novamente usando o formato dd/MM/AAAA.\nPressione ENTER para continuar" );
	            input.nextLine();
	            break;
	        }
				System.out.println("Confirmar devolucao");
				input.nextLine();
				if(locadora.removerAlugado(ca))
					System.out.println("Devolucao executada com sucesso");
			
					
			
			}catch(ExcecaoNenhumCarroDisponivel e) {
				System.out.println("nenhum veiculo encontrado, tente novamente.");
			}
			
				
		
			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
			
		break;
	
			case 7:
			//SAIR
			
			persistencia.salvarNoArquivo(locadora, ARQUIVO);
			
			System.out.println("Obrigado por utilizar nosso sistema!");

			System.out.println("Pressione ENTER para continuar");
			input.nextLine();
			System.out.println("System has been closed.");
			menu = 0;
			
			break;
			default:
				System.out.print("Opção inválida, tente novamente.");
				System.out.print("Pressione ENTER para continuar");
				input.nextLine();
			break;
			
			
			
			}
			
		}
		
	}
	
}