package br.ucs.poo.trabalho2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cinema implements Serializable{
	private String nome;
	private String endereco;
	List<Genero> generos = new ArrayList<>(); //lista de generos
	List<Sala> salas = new ArrayList(); //lista de salas do cinema
	List<Filme> filmes = new ArrayList(); //lista de filmes do cinema
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
	
	public Filme exibeFilmes(int i) {
		
		return filmes.get(i);
	}
	public void filmesPadrao() {
		this.filmes.add(new Filme("Pequeno Príncipe",2015,"A Pequena Garota encontra o excêntrico Aviador, que a introduz ao mágico mundo do Pequeno Príncipe. \nNeste mundo em que tudo é possível, a Garota aprende a redescobrir sua infância."));
		this.filmes.add(new Filme("Homem-Aranha : Aranha-Verso",2018,"Após ser atingido por uma teia radioativa, Miles Morales, um jovem negro do Brooklyn, se torna o Homem-Aranha, inspirado no legado do já falecido Peter Parker. \nEntretanto, ao visitar o túmulo de seu ídolo em uma noite chuvosa, ele é surpreendido com a presença do próprio Peter, vestindo o traje do herói por baixo de um sobretudo. A surpresa fica ainda maior quando Miles descobre que ele veio de uma dimensão paralela, assim como outras versões do Homem-Aranha."));
		this.filmes.add(new Filme("Estranha Forma de Vida",2023,"Do aclamado cineasta espanhol Pedro Almodóvar, Estranha Forma de Vida é um faroeste diferente do comum. Aqui acompanhamos o encontro de Silva, um caubói mexicano, \ne Jake, o xerife de uma pequena cidade.\r\n"+ "\r\n"+ "Após 25 anos separados, memórias e emoções são reavivadas. Mas no dia seguinte percebemos que aquele encontro esconde outras intenções.\r\n"+ "\n"+ "O filme é um média-metragem de 31 minutos, mas consegue desenvolver bem a trama e envolver o público.."));
		this.filmes.add(new Filme("Oppenheimer",2023,"Conta a história de um cientista que trabalhou como diretor do Laboratório de Los Alamos durante a Segunda Guerra, sendo um dos responsáveis pelo Projeto Manhattan, \nque elaborou a bomba atômica e destruiu as cidades japonesas de Hiroshima e Nagasaki em 1945."));
		this.filmes.add(new Filme("Missão impossível: acerto de contas", 2023, "A história, recheada de ação, espionagem e adrenalina, tem Tom Cruise como protagonista no papel de Ethan Hunt, um espião norte-americano que agora precisa impedir que uma arma perigosa seja usada contra a humanidade."));
		this.filmes.add(new Filme("Barbie",2023,"A rotina de Barbie acontece em um mundo divertido e sem preocupações, até que um dia ela percebe que existe algo errado com sua vida \"perfeita\". \nAssim, ela vai par ao mundo real, onde encontra muitos desafios, além da oportunidade de descobrir o valor das coisas que realmente importam."));
		Diretor d = new Diretor();
		Ator a = new Ator();
		a.setNome("Animação");
		d.setNome("Mark Osborne");
		d.setConjuge("não é casado");
		d.setPaisOrigem("Estados Unidos");
		this.filmes.get(0).diretores.add(d);
		this.filmes.get(0).atores.add(a);
		this.filmes.get(0).genero.setGenero("Aventura");
		
		d.setNome("Petter Ramsey");
		d.setConjuge(" ");
		d.setPaisOrigem(" ");
		this.filmes.get(1).diretores.add(d);
		this.filmes.get(1).atores.add(a);
		this.filmes.get(1).genero.setGenero("Aventura");
		
		d.setNome("Christopher Nolan");
		d.setConjuge(" ");
		d.setPaisOrigem(" ");
		a.setNome("Cillian Murphy");
		this.filmes.get(3).diretores.add(d);
		this.filmes.get(3).atores.add(a);
		this.filmes.get(3).genero.setGenero("Suspense");
		
		d.setNome("Pedro Almodóvar");
		a.setNome("Pedro Pascal");
		this.filmes.get(2).diretores.add(d);
		this.filmes.get(2).atores.add(a);
		this.filmes.get(2).genero.setGenero("Suspense");
		
		d.setNome("Christopher McQuarrie");
		a.setNome("Tom Cruise");
		this.filmes.get(4).diretores.add(d);
		this.filmes.get(4).atores.add(a);
		this.filmes.get(4).genero.setGenero("Ação");
		
		
		d.setNome("Greta Gerwig");
		a.setNome("Margot Robbie");
		this.filmes.get(5).diretores.add(d);
		this.filmes.get(5).atores.add(a);
		this.filmes.get(5).genero.setGenero("Drama");
		
	}
	public void generosPadrao() {
		generos.add(new Genero("Ação"));
		generos.add(new Genero("Aventura"));
		generos.add(new Genero("Romance"));
		generos.add(new Genero("Suspense"));
		generos.add(new Genero("Terror"));
	}
	public void salasPadrao() {
		salas.add(new Sala(1));
		salas.add(new Sala(2));
		salas.get(0).assentos.add(new Assento("A",1));
		salas.get(0).assentos.add(new Assento("A",2));
		salas.get(0).assentos.add(new Assento("A",3));
		salas.get(0).assentos.add(new Assento("A",4));
		salas.get(0).assentos.add(new Assento("A",5));
		salas.get(0).assentos.add(new Assento("B",1));
		salas.get(0).assentos.add(new Assento("B",2));
		salas.get(0).assentos.add(new Assento("B",3));
		salas.get(0).assentos.add(new Assento("B",4));
		salas.get(0).assentos.add(new Assento("B",5));
		salas.get(0).assentos.add(new Assento("C",1));
		salas.get(0).assentos.add(new Assento("C",2));
		salas.get(0).assentos.add(new Assento("C",3));
		salas.get(0).assentos.add(new Assento("C",4));
		salas.get(0).assentos.add(new Assento("C",5));
		salas.get(0).assentos.add(new Assento("A",1));
		salas.get(0).assentos.add(new Assento("A",2));
		salas.get(1).assentos.add(new Assento("A",3));
		salas.get(1).assentos.add(new Assento("A",4));
		salas.get(1).assentos.add(new Assento("A",5));
		salas.get(1).assentos.add(new Assento("B",1));
		salas.get(1).assentos.add(new Assento("B",2));
		salas.get(1).assentos.add(new Assento("B",3));
		salas.get(1).assentos.add(new Assento("B",4));
		salas.get(1).assentos.add(new Assento("B",5));
		salas.get(1).assentos.add(new Assento("C",1));
		salas.get(1).assentos.add(new Assento("C",2));
		salas.get(1).assentos.add(new Assento("C",3));
		salas.get(1).assentos.add(new Assento("C",4));
		salas.get(1).assentos.add(new Assento("C",5));
	}
	
	public void adicionaSala(int i) {
		Sala s = new Sala();
		Date d = new Date();
		//s.horariosDisponiveis();
		s.setNumero(i);
		s.assentos.add(new Assento("A", 1));
		s.assentos.add(new Assento("A", 2));
		s.assentos.add(new Assento("A", 3));
		s.assentos.add(new Assento("A", 4));
		s.assentos.add(new Assento("A", 5));
		s.assentos.add(new Assento("B", 1));
		s.assentos.add(new Assento("B", 2));
		s.assentos.add(new Assento("B", 3));
		s.assentos.add(new Assento("B", 4));
		s.assentos.add(new Assento("B", 5));
		s.assentos.add(new Assento("C", 1));
		s.assentos.add(new Assento("C", 2));
		s.assentos.add(new Assento("C", 3));
		s.assentos.add(new Assento("C", 4));
		s.assentos.add(new Assento("C", 5));
		this.salas.add(s);
	}
	public void matrizAssentos(List<Assento> assentos) {
		
		for (int i =0; i< assentos.size();i++) {
			if(assentos.get(i).getFileira().equalsIgnoreCase("A") && assentos.get(i).getNumero()== 0) {
				System.out.print("A ");
			}
			if(assentos.get(i).getFileira().equalsIgnoreCase("B") && assentos.get(i).getNumero()== 0) {
				System.out.print("A ");
			}
			if(assentos.get(i).getFileira().equalsIgnoreCase("C") && assentos.get(i).getNumero()== 0) {
				System.out.print("C ");
			}
			if(assentos.get(i).getFileira().equalsIgnoreCase("D") && assentos.get(i).getNumero()== 0) {
				System.out.print("D ");
			}
			if(assentos.get(i).getFileira().equalsIgnoreCase("E") && assentos.get(i).getNumero()== 0) {
				System.out.print("E ");
			}
		}
		
	}
	public void removeFilme(String nome) {
		int i;
		for(i=0; i<this.filmes.size();) {
			if(this.filmes.get(i).getNome().equalsIgnoreCase(nome)) {
				this.filmes.remove(i);
				i++;
			
			}
			
		}
			
	}
	
}
