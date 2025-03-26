package br.ucs.poo.trabalho2;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Interface {
	
	public static String ARQUIVO = "arquivo.dat";
	

	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		try {
		File f = new File(ARQUIVO);
		f.createNewFile();
		}catch(EOFException e) {
			e.getMessage();
		}
		Cinema cinema = new Cinema();
		Filme f2 = new Filme();
		
		
		
		int l=0;
		int k=0;
		int i,wh = 0, op = 0;
		
		cinema.setNome("Paramount");
		cinema.setEndereco("Av. Rio Branco, 311 - Centro, Rio de Janeiro - RJ, 20040-903");
		int menu = 0;
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		cinema.generosPadrao();
		cinema.salasPadrao();
		cinema.salas.get(0).horarios.add(new Horario());
		cinema.salas.get(0).horarios.get(0).horariosPadrao();
		LocalDate d = LocalDate.of(2023, 11 ,29);
		cinema.salas.get(0).horarios.get(0).setD(d);
		LocalDate d2 = LocalDate.of(2023, 11 ,19);
		cinema.salas.get(1).horarios.add(new Horario());
		cinema.salas.get(1).horarios.get(0).horariosPadrao();
		cinema.salas.get(1).horarios.get(0).setD(d2);
	
		cinema.filmesPadrao();
		cinema.salas.get(0).horarios.get(0).horas.get(0).setFilme(cinema.filmes.get(0));
		cinema.salas.get(0).horarios.get(0).horas.get(1).setFilme(cinema.filmes.get(3));
		cinema.salas.get(0).horarios.get(0).horas.get(2).setFilme(cinema.filmes.get(2));
		cinema.salas.get(0).horarios.get(0).horas.get(3).setFilme(cinema.filmes.get(4));
		cinema.salas.get(0).horarios.get(0).horas.get(4).setFilme(cinema.filmes.get(5));
		cinema.salas.get(0).horarios.get(0).horas.get(5).setFilme(cinema.filmes.get(2));
		cinema.salas.get(0).horarios.get(0).horas.get(6).setFilme(cinema.filmes.get(2));
		cinema.salas.get(1).horarios.get(0).horas.get(0).setFilme(cinema.filmes.get(0));
		cinema.salas.get(1).horarios.get(0).horas.get(2).setFilme(cinema.filmes.get(3));
		cinema.salas.get(1).horarios.get(0).horas.get(1).setFilme(cinema.filmes.get(2));
		cinema.salas.get(1).horarios.get(0).horas.get(5).setFilme(cinema.filmes.get(4));
		cinema.salas.get(1).horarios.get(0).horas.get(4).setFilme(cinema.filmes.get(0));
		cinema.salas.get(1).horarios.get(0).horas.get(3).setFilme(cinema.filmes.get(2));
		cinema.salas.get(1).horarios.get(0).horas.get(3).setFilme(cinema.filmes.get(2));

		
		try {
			cinema = DataFile.carregaDados(ARQUIVO);
			}catch(FileNotFoundException e) {
				e.getMessage();
			} catch (ClassNotFoundException e) {
			
				e.getMessage();
			} catch (IOException e) {
				
				e.getMessage();
			}

		while (menu != 1) {
			System.out.println("	-----Bem vindo ao cinema " + cinema.getNome() + "-----");
			System.out.println("Localizado em " + cinema.getEndereco());
			System.out.println("1 -CADASTROS.");
			System.out.println("2 -EXCLUIR.");
			System.out.println("3 -LISTAR.");
			System.out.println("4 -COMPRAR INGRESSOS.");
			System.out.println("5 -ALTERAR");
			System.out.println("6 -SAIR");
			System.out.print("Opção: ");
			op = input.nextInt();
			input.nextLine();
			switch (op) {

			case 1://CADASTRAR
				System.out.println();
				System.out.println("-----Cinema Manager----");
				System.out.println("1- Registrar filme");
				System.out.println("2- Registrar Genero");
				System.out.println("3- adicionar Sala");
				System.out.println("4- Cadastrar Ator ");
				System.out.println("5- Cadastrar Diretor ");
				System.out.println("6- Adicionar Horario ");
				System.out.println("7- Adicionar Filme a um horario ");
				int op1 = 0;
				op1 = input.nextInt();
				input.nextLine();
			 k =0;
				switch (op1) {//SERIALIZAR CASES
				case 1:
				try { System.out.println("Digite o nome do filme: ");
					Filme film = new Filme();
					film.setNome(input.nextLine());
					System.out.println("Digite o ano: ");
					film.setAno(input.nextInt());
					input.nextLine();
					System.out.println("Digite a sinópse: ");
					film.setDescricao(input.nextLine());
					System.out.println(cinema.generos);
					System.out.println("Digite o genero do filme: ");
					film.genero.setGenero(input.nextLine());
					System.out.println();
					System.out.println("--------------------");
					System.out.println("Atores do filme: ");
					k = 1;
					while (k == 1) {
						Ator ator = new Ator();
						System.out.print("Nome do ator(a): ");
						ator.setNome(input.nextLine());
						System.out.print("País de origem: ");
						ator.setPaisOrigem(input.nextLine());
						System.out.print("Conjuge: ");
						ator.setConjuge(input.nextLine());
						film.atores.add(ator);
						System.out.print("Deseja adicionar mais um ator(a)? 1-SIM 2-NAO");
						k = input.nextInt();
						input.nextLine();
					}
					k = 1;
					System.out.println();
					System.out.println("--------------------");
					System.out.println("Diretores do filme: ");
					while (k == 1) {
						Diretor diretor = new Diretor();
						System.out.print("Nome do diretor(a): ");
						diretor.setNome(input.nextLine());
						System.out.print("País de origem: ");
						diretor.setPaisOrigem(input.nextLine());
						System.out.print("Conjuge: ");
						diretor.setConjuge(input.nextLine());
						film.diretores.add(diretor);
						System.out.print("Deseja adicionar mais um diretor(a)? 1-SIM 2-NAO");
						k = input.nextInt();
						input.nextLine();

					}
					cinema.filmes.add(film);
					
					DataFile.SalvarDados(cinema, ARQUIVO);
					
					System.out.println("FILME ADICIONADO. ");
					System.out.println("Pressione [ENTER] para retornar ao menu principal.");
				}catch(InputMismatchException ime) {
					ime.getMessage();
				}
					input.nextLine();
					break;
				case 2:
				
					System.out.println("Digite o gênero a ser adicionado: ");
					cinema.generos.add(new Genero(input.nextLine()));
					System.out.println("GENERO ADICIONADO.");
					System.out.println("Pressione [ENTER] para retornar ao menu principal.");
					
					DataFile.SalvarDados(cinema, ARQUIVO);
					
					input.nextLine();
					break;
				case 3: 
					
				try{ Sala s = new Sala();
					System.out.println("---Salas já disponíveis---");
					System.out.println(cinema.salas);
					System.out.println("----------");
					System.out.println("Digite o número da nova sala: ");
					int num = 0;
					
					num = input.nextInt();
					cinema.adicionaSala(num);
					input.nextLine();
					System.out.println("digite o dia/mês que essa sala ficará disponível  ");
					System.out.print("Dia: ");
					int dia = input.nextInt();
					input.nextLine();
					System.out.print("Mês: ");
					int mes = input.nextInt();
					input.nextLine();
					LocalDate h = LocalDate.of(2023,mes,dia);
					cinema.salas.get(num-1).horarios.add(new Horario());
					cinema.salas.get(num-1).horarios.get(0).setD(h);
					cinema.salas.get(num-1).horarios.get(0).horariosPadrao();
					System.out.println(cinema.salas.get(num-1));
					
					DataFile.SalvarDados(cinema, ARQUIVO);
					System.out.println("SALA ADICIONADA.");
					System.out.println("Pressione [ENTER] para retornar ao menu principal.");
					input.nextLine();
					
				}catch(RuntimeException re) {
					re.printStackTrace();
				}
					break;
				case 4:
					k = 1;
					while (k == 1) {
						Ator ator = new Ator();
						System.out.print("Nome do ator(a): ");
						ator.setNome(input.nextLine());
						System.out.print("País de origem: ");
						ator.setPaisOrigem(input.nextLine());
						System.out.print("Conjuge: ");
						ator.setConjuge(input.nextLine());
						System.out.println("Está presente no filme: ");
						 i = 0;
						for (i = 0; i < cinema.filmes.size(); i++) {
							System.out.print((i + 1) + "-");
							System.out.println(cinema.exibeFilmes(i));
						}
						System.out.println("Caso não esteja presente em nenhum filme listado digite [0] e cadastre o filme");
						System.out.println("Digite um número qualquer para continuar: ");
						int select = input.nextInt();
						input.nextLine();
						if (select == 0) {
							k = 2;
						} else {
							System.out.print("Ator pertence ao filme número: ");
							select = input.nextInt();
							input.nextLine();
							cinema.filmes.get(select - 1).atores.add(ator);
							System.out.println("Deseja adicionar mais um ator(a)? 1-SIM 2-NAO");
							k = input.nextInt();
							input.nextLine();
						}
					}
					DataFile.SalvarDados(cinema, ARQUIVO);
					break;
				case 5:
			         k = 1;
					while (k == 1) {
						Diretor diretor = new Diretor();
						System.out.print("Nome do diretor(a): ");
						diretor.setNome(input.nextLine());
						System.out.print("País de origem: ");
						diretor.setPaisOrigem(input.nextLine());
						System.out.print("Conjuge: ");
						diretor.setConjuge(input.nextLine());
						System.out.print("Está presente no filme: ");

						i = 0;
						for (i = 0; i < cinema.filmes.size(); i++) {
							System.out.print((i + 1) + "-");
							System.out.println(cinema.exibeFilmes(i));
						}
						System.out.println("Se o filme está listado pressione um número qualquer ");
						System.out.println("Caso não esteja presente em nenhum filme listado digite [0] e cadastre o filme");

						int select = input.nextInt();
						input.nextLine();
						if (select == 0) {
							k = 2;
						} else {
							System.out.print("Diretor pertence ao filme número: ");
							select = input.nextInt();
							input.nextLine();
							cinema.filmes.get(select - 1).atores.add(diretor);
							System.out.println("Deseja adicionar mais um diretor(a)? 1-SIM 2-NAO");
							k = input.nextInt();
							input.nextLine();
						}
					}
					DataFile.SalvarDados(cinema, ARQUIVO);
					break;
					
				case 6:
					 System.out.println("----SALAS DISPONIVEIS----");
					for(i =0; i<cinema.salas.size();i++) {
						System.out.println(cinema.salas.get(i));
						
						for(int j=0; j <cinema.salas.get(i).horarios.size(); j++) {
							System.out.println(cinema.salas.get(i).horarios.get(j).getD());
							System.out.println(cinema.salas.get(i).horarios.get(j).horas);
						}
					}
					System.out.println("Selecione o número de uma sala: ");
				int	 num1 = input.nextInt();
					input.nextLine();
					System.out.println("digite o dia/mês que essa sala ficará disponível  ");
					System.out.print("Dia: ");
				int	dia1 = input.nextInt();
					input.nextLine();
					System.out.print("Mês: ");
				int	 mes1 = input.nextInt();
					input.nextLine();
					LocalDate h2 = LocalDate.of(2023,mes1,dia1);
					cinema.salas.get(num1-1).horarios.add(new Horario());
					cinema.salas.get(num1-1).horarios.get(cinema.salas.get(num1-1).horarios.size()-1).setD(h2);
					cinema.salas.get(num1-1).horarios.get(cinema.salas.get(num1-1).horarios.size()-1).horariosPadrao();
					
					
					
					input.nextLine();
				
					break;
					
				case 7:
			
					System.out.println("Selecione uma sala ");
					for(i = 0 ; i<cinema.salas.size(); i ++) {
						System.out.println(cinema.salas.get(i));
					}
				int	 num2 = input.nextInt();
					 input.nextLine();
					 System.out.println("Horario disponivel: ");
					for(i = 0 ; i<cinema.salas.size();i++){
						if(cinema.salas.get(i).getNumero() == (num2)) {
							for(int j =0; j< cinema.salas.get(i).horarios.size(); j++) {
								for(k = 0; k<cinema.salas.get(i).horarios.get(j).horas.size(); k++) {
									
							if(cinema.salas.get(i).horarios.get(j).horas.get(k).filme == null) {
								int index = cinema.salas.get(i).horarios.get(j).horas.indexOf(cinema.salas.get(i).horarios.get(j).horas.get(k));
								System.out.print("ID: "+ index+" ");
								System.out.println(cinema.salas.get(i).horarios.get(j).horas.get(k));
							}
							
							}
						}
					}
					
				}
					 System.out.println("Digite o Id do Horario desejado: ");
					 int id = input.nextInt();
					 input.nextLine();
					 
					 
					 System.out.println("Filmes disponíveis: ");
					 for(i =0 ; i<cinema.filmes.size() ; i++) {
						 int index = cinema.filmes.indexOf(cinema.filmes.get(i));
						 System.out.print("ID do filme: "+ index);
						 System.out.println(cinema.filmes.get(i));
					 }
					 System.out.println("Digite o id do filme que deseja adicionar: ");
					 int idFilme = input.nextInt();
					 input.nextLine();
					 
					 for(i = 0 ; i<cinema.salas.size();i++){
							if(cinema.salas.get(i).getNumero() == (num2)) {
								for(int j =0; j< cinema.salas.get(i).horarios.size(); j++) {
									for(k = 0; k<cinema.salas.get(i).horarios.get(j).horas.size(); k++) {
				if(cinema.salas.get(i).horarios.get(j).horas.get(k) == cinema.salas.get(i).horarios.get(j).horas.get(id)) {
					cinema.salas.get(i).horarios.get(j).horas.get(k).setFilme(cinema.filmes.get(idFilme));
							
				
				}	
									}
							}
						}
						
					}
				System.out.println("Pressione [ENTER] pra retornar ao menu principal. " );
				DataFile.SalvarDados(cinema, ARQUIVO);
				input.nextLine();
				break;	

				}
				break;
				
			case 2://EXCLUIR
				System.out.println();
				System.out.println("-----Cinema Manager----");
				System.out.println("1- Excluir filme.");
				System.out.println("2- Excluir Genero");
				System.out.println("3- Excluir Sala");
				
			 op1 = 0;
			 op1= input.nextInt();
			 input.nextLine();
			switch(op1) {
				case 1://EXCLUIR FILME

					System.out.println();
					System.out.println("---EXCLUIR FILME---");
					
				
					for ( i =0; i < cinema.filmes.size();i++) {
						System.out.println("["+ (i+1) +"]" +cinema.filmes.get(i));
					}
					System.out.println("Digite o número do filme que deseja excluir: ");
					int n= input.nextInt();
					input.nextLine();
					cinema.filmes.remove((n-1));
				
				
					System.out.println("FILME REMOVIDO");
					System.out.println("Pressione [ENTER] para retornar ao menu principal.");
					String in = input.nextLine();
					DataFile.SalvarDados(cinema, ARQUIVO);
				break;
				
				case 2://EXLCUIR GENERO
			
				System.out.println("\n--EXCLUIR GENERO--");
				
				for(i=0; i<cinema.generos.size();i++) {
					System.out.println("["+(i+1)+"]"+ cinema.generos.get(i));
					
				}
				System.out.println("Digite o número do gênero que deseja excluir: ");
				int n1 = input.nextInt();
				input.nextLine();
				cinema.generos.remove(n1-1);
				System.out.println("GENERO REMOVIDO");
				System.out.println("Pressione [ENTER] para retornar ao menu principal.");
				input.nextLine();
				
				DataFile.SalvarDados(cinema, ARQUIVO);
				break;
				case 3://EXCLUIR SALA
				
				 System.out.println("---EXCLUIR SALA---");
				System.out.println("Lista de salas disponíveis no sistema ");
				
				for(i=0; i<cinema.salas.size();i++) {
					System.out.println("SALA - "+ cinema.salas.get(i).getNumero());
					
				}
				System.out.print("Digite o número da sala que deseja exluir: ");
				int n3 = input.nextInt();
				input.nextLine();
				for(i = 0; i<cinema.salas.size(); i++) {
					if(n3 == cinema.salas.get(i).getNumero()) {
						cinema.salas.remove(i);
					}
				}
				
				DataFile.SalvarDados(cinema, ARQUIVO);
				break;
				
			}		
			break;
			case 3://LISTAGEM
				System.out.println("Digite o número para selecionar o elemento: ");
				System.out.println("1 -Listar salas. ");
				System.out.println("2 -Listar Filmes. ");
				System.out.println("3 -Pesquisar Filme. ");
				System.out.println("4 -Listar Generos. ");
				int op2 = input.nextInt();
				input.nextLine();
				switch (op2) {
				case 1:
					for(i = 0; i<cinema.salas.size(); i++) {
						System.out.println(cinema.salas.get(i));
						System.out.println(cinema.salas.get(i).horarios);
					}
					
				String in = input.nextLine();	
				break;//CASE 1 LISTAGEM DE SALAS
				
				case 2:
					System.out.println("Filmes: ");
					for(Filme film: cinema.filmes){
						System.out.println(film);
					}
					input.nextLine();
					break;
					
				case 3:
					System.out.println("Digite a palavra a ser pesquisada: ");
					String palavra = input.nextLine();
						
					for(i=0; i < cinema.filmes.size() ; i++) {
						if(cinema.filmes.get(i).getNome().contains(palavra)) {
							int index = cinema.filmes.indexOf(cinema.filmes.get(i));
							System.out.print(index);
							System.out.println(cinema.filmes.get(i));
						}
					}
					System.out.println("Digite o número do filme que deseja detalhar: ");	
					int numero = input.nextInt();
					input.nextLine();
					System.out.println("Nome: "+cinema.filmes.get(numero).getNome());
					System.out.println("Ano: "+ cinema.filmes.get(numero).getAno());
					System.out.println(cinema.filmes.get(numero).getDescricao());
					System.out.println("Genero: "+cinema.filmes.get(numero).genero);				
					System.out.println("----Atores ---");
					System.out.println(cinema.filmes.get(numero).atores);
					System.out.println("----Diretores ---");
					System.out.println(cinema.filmes.get(numero).diretores);
					
					System.out.println("\nPressione [ENTER] para voltar ao menu principal.");
					input.nextLine();
					
					break;//Pesquisa por nome
					
				case 4:
					System.out.println("Lista de Generos: ");
					for(Genero g: cinema.generos) {
					System.out.println(g);	
					
					}
					
				System.out.println("Pressione [ENTER] para retornar ao menu principal.");
				input.nextLine();
				break;
					
				}
				
			
			break;//break case 3
			
			case 4://COMPRAR INGRESSOS
				try{System.out.println("--------------------");
				System.out.println("Filmes disponíveis: ");
				
				for (i= 0; i<cinema.filmes.size();i++) {
			
					System.out.println(cinema.filmes.get(i));
				}
			System.out.println("Digite o nome do filme que deseja comprar um ingresso: ");
			String nome = input.nextLine();
			for(Filme film : cinema.filmes) {
				if (film.getNome().equalsIgnoreCase(nome)) {
					
					f2 = film;
				}
			}
			
			
			System.out.println("---------------------------");
			for( i =0; i< cinema.salas.size();i++) {
				for(int j =0 ; j < cinema.salas.get(i).horarios.size(); j++) {
					for(k = 0;   k< cinema.salas.get(i).horarios.get(j).horas.size(); k++) {
						if(cinema.salas.get(i).horarios.get(j).horas.get(k).filme == f2 ) {
							System.out.println("================");
							System.out.println(cinema.salas.get(i));
							
							System.out.println("DATA: "+cinema.salas.get(i).horarios.get(j).getD());
							System.out.println(cinema.salas.get(i).horarios.get(j).horas.get(k));
							//System.out.println("Ingressos disponíveis: ");
						//	System.out.println(cinema.salas.get(i).horarios.get(j).horas.get(k).filme.getNrIngressos());
							
						}
						
						
					}
				}
	
			}
			Sala sl = new Sala();
			System.out.println("Digite o número da sala: ");
			int nro = input.nextInt();
			input.nextLine(); 
			System.out.print("digite o dia: ");
			int dia = input.nextInt();
			input.nextLine();
			System.out.print("digite o mês: ");
			int mes = input.nextInt();
			input.nextLine();
			LocalDate dt = null;
			dt.of(2023, mes, dia);
			System.out.print("Hora: ");
			String h2 =input.nextLine();
			
			for( i =0; i< cinema.salas.size();i++) {
				for(int j =0 ; j < cinema.salas.get(i).horarios.size(); j++) {
					for( k = 0;   k< cinema.salas.get(i).horarios.get(j).horas.size(); k++) {
						if(cinema.salas.get(i).getNumero() == nro && cinema.salas.get(i).horarios.get(j).horas.get(k).getHora().equalsIgnoreCase(h2) ) {
							
							//cinema.salas.get(i).horarios.get(j).horas.get(k).filme.getNrIngressos();
							
							
							System.out.println("{1}{2}{3}{4}{5}");
							for(Assento s: cinema.salas.get(i).horarios.get(j).horas.get(k).assentos) {
								if(s.getFileira().equalsIgnoreCase("A")&& s.getNumero() == 1) {
									System.out.print("A" );
								
								}
								if(s.getFileira().equalsIgnoreCase("B")&& s.getNumero() == 1) {
									System.out.println();
									System.out.print("B");
									
								}
								if(s.getFileira().equalsIgnoreCase("C")&& s.getNumero() == 1) {
									System.out.println();
									System.out.print("C");
								
								}
								if(s.getFileira().equalsIgnoreCase("D") && s.getNumero() == 1) {
									System.out.println();
									System.out.print("D");
									
								}
								if(s.getFileira().equalsIgnoreCase("E") && s.getNumero() == 1) {
									System.out.println();
									System.out.print("E");
								
								}
								System.out.print(s);
								
								
								
							}
							
						
						}
						
						
					}
				}
	
			}
			System.out.println();
			System.out.print("Fileira: ");
			String fileira = input.nextLine();
			
			System.out.print("Número: ");
			int numero = input.nextInt();
			input.nextLine();
			for( i =0; i< cinema.salas.size();i++) {
				for(int j =0 ; j < cinema.salas.get(i).horarios.size(); j++) {
					for(k = 0;   k< cinema.salas.get(i).horarios.get(j).horas.size(); k++) {
						if(cinema.salas.get(i).getNumero() == nro && cinema.salas.get(i).horarios.get(j).horas.get(k).getHora().equalsIgnoreCase(h2) ) {
							for(Assento s: cinema.salas.get(i).horarios.get(j).horas.get(k).assentos) {
								if(s.getNumero()==numero && s.getFileira().equalsIgnoreCase(fileira) && s.getOcupado() == false) {
									
									int index =cinema.salas.get(i).horarios.get(j).horas.get(k).assentos.indexOf(s);
									
									cinema.salas.get(i).horarios.get(j).horas.get(k).assentos.get(index).setOcupado(true);
									cinema.salas.get(i).horarios.get(j).horas.get(k).filme.diminuiIngresso();
								}
								
							}
						}
						
						
					}
				}
				
			}
			
			Ingresso ingresso = new Ingresso();
			System.out.println("Para terminar a compra do ingresso preencha um cadastro ");
			
			System.out.println("Nome: ");
			String n = input.nextLine();
			ingresso.setNomeComprador(n);
			System.out.println("Celular: ");
			String celular = input.nextLine();
			ingresso.setCelular(celular);
			System.out.println("Preço = "+ ingresso.getPreco());
			System.out.println("Meia Entrada: 1-Sim 2-Não");
			int meia = input.nextInt();
			input.nextLine();
			if(meia == 1) {
				ingresso.setMeiaEntrada(ingresso.getPreco());
				
			}
			System.out.println(ingresso);
			System.out.println("Pressione [ENTER] para retornar ao menu principal.");
			DataFile.SalvarDados(cinema, ARQUIVO);
			
		    input.nextLine();
				}catch(RuntimeException e) {
					e.getMessage();
					System.out.println("Opção Invalida!");
				
				}
				
			break;
			
			case 5:
				System.out.println("---ALTERAÇÂO---");
				System.out.println("1 -Alterar lista de generos do catálogo");
				System.out.println("2 -Alterar filme");
				System.out.println("3 -Alterar Sala/Horarios");
				
				int opCase5 = input.nextInt();
				input.nextLine();
				switch(opCase5) {
				case 1:
					
					for(i=0; i<cinema.generos.size() ; i++) {
						int index = cinema.generos.indexOf(cinema.generos.get(i));					
						System.out.print((index+1)+": ");	
						System.out.println(cinema.generos.get(i));
						
					}
					
					System.out.println("Digite o número do genero que deseja alterar: ");
					int generoSelect = input.nextInt();
					input.nextLine();
					
					System.out.println("Digite o novo gênero: ");
					String gen = input.nextLine();
					
					for(i = 0 ; i < cinema.generos.size(); i++) {
						if( i == (generoSelect-1)) {
							cinema.generos.get(i).setGenero(gen);
							
						}				
					}
					System.out.println("Genero alterado com sucesso!");
					System.out.println("Pressione [ENTER] para retornar ao menu principal. ");
					
					DataFile.SalvarDados(cinema, ARQUIVO);
					
				break;
				
				case 2://ALTERAÇÃO DE FILME
					System.out.println("Selecione o filme que deseja alterar: ");
					for(i=0; i <cinema.filmes.size(); i ++) {
						int index = cinema.filmes.indexOf(cinema.filmes.get(i));
						System.out.print((index+1)+": ");
						System.out.println(cinema.filmes.get(i));
						
						
					}
					int filmSelect = input.nextInt();
					filmSelect -= 1;
					input.nextLine();
					
					System.out.println();
					System.out.println("Tipo de alteração: ");
					System.out.println("1 -Nome");
					System.out.println("2 -Ano");
					System.out.println("3 -Sinópse");
					System.out.println("4 -Genero");
					System.out.println("5 -Atores");
					System.out.println("6 -Diretores");
					
					int opAlteraFilme = input.nextInt();
					input.nextLine();
					
					switch(opAlteraFilme) {
					
					case 1:
					try {	System.out.println("Digite o novo nome: ");
						for(i = 0 ; i<cinema.filmes.size(); i++) {
							if(i == filmSelect) {
							cinema.filmes.get(i).setNome(input.nextLine());
								
							}
							
						}
						DataFile.SalvarDados(cinema, ARQUIVO);
						System.out.println("Nome alterado.");
						System.out.println("Pressione [ENTER] para voltar ao menu principal.");
					}catch(RuntimeException rte){
						rte.getMessage();
						System.out.println("Nome invalido!\n Tente novamente.");
					}
					
						
					break;
					
					case 2:
					try {	System.out.println("Digite o novo ano que será substituido no filme: ");
						
						
						for(i =0; i<cinema.filmes.size();i++) {
							if( i == filmSelect) {
								
								cinema.filmes.get(i).setAno(input.nextInt());
								
								
							}
							
						}
						DataFile.SalvarDados(cinema, ARQUIVO);
						System.out.println("Ano alterado.");
						System.out.println("Pressione [ENTER] para voltar ao menu principal.");
						input.nextLine();
					}catch(RuntimeException rte) {
						rte.getMessage();
						System.out.println("Opção Invalida!");
					}
					break;
					case 3:
						
						for(i = 0; i<cinema.filmes.size() ; i++) {
						
							if(i== filmSelect) {
								System.out.println("ATUAL:  ");
								System.out.println(cinema.filmes.get(i).getDescricao());
								System.out.println("Digite a nova Sinópse do filme: ");
								cinema.filmes.get(i).setDescricao(input.nextLine());
						}
							
						}
						System.out.println("Descrição do filme alterada.");
						System.out.println("Pressione [ENTER] para voltar ao menu principal.");
						
					
					break;
						
					case 4:
						System.out.println("Digite a alteração do genero: ");
						for(i = 0; i<cinema.filmes.size(); i++) {
							if ( i == filmSelect) {
								cinema.filmes.get(i).genero.setGenero(input.nextLine());
							}
							
						}
						DataFile.SalvarDados(cinema, ARQUIVO);
						System.out.println("Genero alterado.");
						System.out.println("Pressione [ENTER] para voltar ao menu principal.");
						
					break;
					
					case 5:
					try {	System.out.println("Atores adicionados: ");
						
						for( i = 0; i < cinema.filmes.get(filmSelect).atores.size(); i++) {
							int index = cinema.filmes.get(filmSelect).atores.indexOf(cinema.filmes.get(filmSelect).atores.get(i));
							System.out.print((index+1)+": ");
							System.out.println(cinema.filmes.get(filmSelect).atores.get(i).getNome());
						}
						
						System.out.println("Digite o número do ator que deseja alterar: ");
						int atorSelect = input.nextInt();
						input.nextLine();
						atorSelect -= 1;
						
						System.out.println("---Ator Selecionado---");
						System.out.println("1 Nome: "+cinema.filmes.get(filmSelect).atores.get(atorSelect).nome);
						System.out.println("2 País de Origem:"+cinema.filmes.get(filmSelect).atores.get(atorSelect).paisOrigem);
						System.out.println("3 Conjuge:"+cinema.filmes.get(filmSelect).atores.get(atorSelect).conjuge);
						System.out.println("Alterar número: ");
						int atorAlteracao = input.nextInt();
						input.nextLine();
						
						if(atorAlteracao == 1) {
							System.out.println("Digite o nome: ");
							cinema.filmes.get(filmSelect).atores.get(atorSelect).setNome(input.nextLine());
						}
						if(atorAlteracao == 2) {
							System.out.println("Digite o nome do País");
							cinema.filmes.get(filmSelect).atores.get(atorSelect).setPaisOrigem(input.nextLine());
						}
						if(atorAlteracao == 3) {
							System.out.println("Digite o nome do conjuge: ");
							cinema.filmes.get(filmSelect).atores.get(atorSelect).setConjuge(input.nextLine());
						}
						
					
						DataFile.SalvarDados(cinema, ARQUIVO);
					}catch(RuntimeException re) {
						re.getMessage();
						System.out.println("Opção Invalida!");
					}
					break;
					
					case 6:
						
						try{System.out.println("Diretores adicionados: ");
						
						for( i = 0; i < cinema.filmes.get(filmSelect).diretores.size(); i++) {
							int index = cinema.filmes.get(filmSelect).diretores.indexOf(cinema.filmes.get(filmSelect).diretores.get(i));
							System.out.print((index+1)+": ");
							System.out.println(cinema.filmes.get(filmSelect).diretores.get(i).getNome());
						}
						
						System.out.println("Digite o número do diretor que deseja alterar: ");
						int diretorSelect = input.nextInt();
						input.nextLine();
						diretorSelect -= 1;
						
						System.out.println("---Diretor Selecionado---");
						System.out.println("1 Nome: "+cinema.filmes.get(filmSelect).diretores.get(diretorSelect).nome);
						System.out.println("2 País de Origem:"+cinema.filmes.get(filmSelect).diretores.get(diretorSelect).paisOrigem);
						System.out.println("3 Conjuge:"+cinema.filmes.get(filmSelect).diretores.get(diretorSelect).conjuge);
						System.out.println("Alterar número: ");
						int diretorAlteracao = input.nextInt();
						input.nextLine();
						
						if(diretorAlteracao == 1) {
							System.out.println("Digite o nome: ");
							cinema.filmes.get(filmSelect).diretores.get(diretorSelect).setNome(input.nextLine());
						}
						if(diretorAlteracao == 2) {
							System.out.println("Digite o nome do País");
							cinema.filmes.get(filmSelect).diretores.get(diretorSelect).setPaisOrigem(input.nextLine());
						}
						if(diretorAlteracao == 3) {
							System.out.println("Digite o nome do conjuge: ");
							cinema.filmes.get(filmSelect).diretores.get(diretorSelect).setConjuge(input.nextLine());
						}
						
						DataFile.SalvarDados(cinema, ARQUIVO);
						}catch(RuntimeException rte) {
							rte.getMessage();
						}
						
					break;
					
					}//ALTERAÇÂO DE FILME
				break;
				
				case 3:
					
					System.out.println("Selecione uma sala.");
					for(i = 0; i < cinema.salas.size(); i++) {
						
						System.out.println(cinema.salas.get(i));
						
					}
					System.out.print("Sala número: ");
					int salaSelect = input.nextInt();
					salaSelect -=1;
					input.nextLine();
					
					for(i=0;  i<cinema.salas.get(salaSelect).horarios.size(); i++ ) {
						int index = cinema.salas.get(salaSelect).horarios.indexOf(cinema.salas.get(salaSelect).horarios.get(i));
						System.out.print((index+1)+": ");
						System.out.println(cinema.salas.get(salaSelect).horarios.get(i));
					}
					System.out.println("Digite o número do Horário que deseja alterar: ");
					int horarioSelect= input.nextInt();
					horarioSelect-=1;
					input.nextLine();
					
					System.out.println("---Horario Selecionado---");
					System.out.println("Data: "+cinema.salas.get(salaSelect).horarios.get(horarioSelect).getD());
					for(i=0; i<cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.size();i++) {
						System.out.print(cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(i).getHora());
						if(cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(i).getFilme() == null){
							System.out.println(" livre.");
						}
						else {
							System.out.println(" "+cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(i).getFilme().getNome());
						}
					}
					
					System.out.println("\nSelecione: ");
					System.out.println("1 -Alterar Data");
					System.out.println("2 -Trocar/adicionar Filme");
					
					int opAlterarHorario = input.nextInt();
					input.nextLine();
					
					
					
					int dia;
					int mes;
					switch(opAlterarHorario) {
					case 1:
						
						System.out.print("Digite o dia: ");
						dia=input.nextInt();
						input.nextLine();
						
						System.out.print("Digite o mês: ");
						mes = input.nextInt();
						input.nextLine();
						
						LocalDate n2 =  LocalDate.of(2023, mes, dia);
						
						cinema.salas.get(salaSelect).horarios.get(horarioSelect).setD(n2);
						System.out.println("Data alterada");
						System.out.println("pressione [ENTER] para retornar ao menu principal");
						
						DataFile.SalvarDados(cinema, ARQUIVO);
					
						
						break;
						
					case 2:
						System.out.println("\n---Selecione um horario---");
						for (i=0; i <cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.size();i++) {
	int index = cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.indexOf(cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(i));
							System.out.print((index+1)+": ");
							System.out.println(cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(i));
		
						}
					int horaSelect = input.nextInt();
					horaSelect-=1;
					input.nextLine();
					System.out.println("---Horario Selecinado---");
					System.out.println(cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(horaSelect));
					System.out.println("filmes disponíveis no catálogo: ");
					for(i=0 ; i < cinema.filmes.size(); i++)	{
					int index = cinema.filmes.indexOf(cinema.filmes.get(i));
						System.out.println((index+1)+": "+cinema.filmes.get(i));
					}
					System.out.print("Adicionar filme número: ");
					int horaFilmeSelect = input.nextInt();
					horaFilmeSelect-=1;
					input.nextLine();
					
					cinema.salas.get(salaSelect).horarios.get(horarioSelect).horas.get(horaSelect).setFilme(cinema.filmes.get(horaFilmeSelect));
					System.out.println("Filme adicionado");
					System.out.println("Pressione [ENTER] para retornar ao menu principal ");
					
					DataFile.SalvarDados(cinema, ARQUIVO);
						
						break;
					}
					
				break;
				
				
				}
			input.nextLine();	
			break;
			
			case 6:
			System.out.println("Pressione [ENTER] para sair. ");
			input.nextLine();
			DataFile.SalvarDados(cinema, ARQUIVO);
			menu = 1;
			
			break;
			}
			
			}//while principal

		
		input.close();
	}
}
