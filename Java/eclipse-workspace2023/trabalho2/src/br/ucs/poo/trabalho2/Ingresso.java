package br.ucs.poo.trabalho2;

import java.io.Serializable;
import java.time.LocalDate;

public class Ingresso implements Serializable {
	private String nomeComprador;
	private LocalDate data;
	String hora;
	private String celular;
	private float preco;
	private float meiaEntrada;
	
	public Ingresso() {
		this.preco = 30f;
		
	}
	Assento assento = new Assento(); // todo ingresso tem um assento 
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate d) {
		this.data = d;
	}
	public String getNomeComprador() {
		return nomeComprador;
	}
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMeiaEntrada() {
		return meiaEntrada;
	}
	public void setMeiaEntrada(float meiaEntrada) {
		this.preco = meiaEntrada/2;
	}
	@Override
	public String toString() {
		return "Ingresso\n" + nomeComprador + "\ncelular:" + celular + "\npreço final:" + preco;
	}
}
