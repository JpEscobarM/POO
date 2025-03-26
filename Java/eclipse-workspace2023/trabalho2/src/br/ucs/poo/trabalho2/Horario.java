package br.ucs.poo.trabalho2;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Date;

public class Horario implements Serializable{
	
	private LocalDate d;
	List<LocalTime> hs = new ArrayList();
	List <Hora> horas = new ArrayList<>();
	Filme filme;
	

	public Horario(int dia,int mes) {
		d.of(2023, mes, dia);
		
	}
	public Horario() {
		
	}
	public void horariosPadrao() {
		horas.add(new Hora("13:00"));
		horas.add(new Hora("14:30"));
		horas.add(new Hora("16:30"));
		horas.add(new Hora("18:00"));
		horas.add(new Hora("19:30"));
		horas.add(new Hora("21:00"));
		horas.add(new Hora("22:30"));
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "Aberto " + this.d;
	}

	
	public LocalDate getD() {
		return d;
	}
	public void setD(LocalDate dia) {
		this.d = dia;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme f) {
		this.filme = f;
	}
	
	
	
	
	
}
