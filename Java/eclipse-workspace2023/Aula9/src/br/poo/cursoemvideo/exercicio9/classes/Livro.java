package br.poo.cursoemvideo.exercicio9.classes;
import br.poo.cursoemvideo.exercicio9.shape.*;
public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private float totPaginas;
	private float pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
//CONSTRUCT:
	public Livro(String titulo, String autor, float totPaginas, float pagAtual, boolean aberto, Pessoa leitor) {
	this.setTitulo(titulo);
	this.setAutor(autor);
	this.setTotPaginas(totPaginas);
	this.setPagAtual(pagAtual);
	this.setAberto(aberto);
	this.setLeitor(leitor);
	}
	
	
//GETTERS AND SETTERS:	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(float totPaginas) {
		this.totPaginas = totPaginas;
	}
	public float getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(float pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}


	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ","
				+ " totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}

	//METODOS:

	@Override
	public void abrir() {
		this.setAberto(true);
	}


	@Override
	public void fechar() {
		this.setAberto(false);
	}


	@Override
	public void folhear() {
		
	}


	@Override
	public void avancarPag() {
		this.setPagAtual(+1);
	}


	@Override
	public void voltarPag() {
		this.setPagAtual(-1);
	}
	


	
	
	
}
