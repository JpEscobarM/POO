package br.ucs.poo.trabalho2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sala implements Serializable{
	private int numero;
	List<Horario>horarios = new ArrayList();//cinema abre das 14 até 11:00 total 10 horas
	List<Assento> assentos = new ArrayList();//assentos da sala
	public Sala() {
		
	}
	/*public void horariosDisponiveis() {
		
		this.horarios.add(new Horario());
		this.horarios.get(0).data.setDate(28);
		this.horarios.get(0).horariosPadrao();
		this.horarios.add(new Horario());
		this.horarios.get(1).data.setDate(29);
		this.horarios.get(1).horariosPadrao();
		this.horarios.add(new Horario());
		this.horarios.get(3).data.setDate(29);
		this.horarios.get(3).horariosPadrao();
		this.horarios.add(new Horario());
		this.horarios.get(4).data.setDate(30);
		this.horarios.get(4).horariosPadrao();
		this.horarios.add(new Horario());
		this.horarios.get(5).data.setDate(31);
		this.horarios.get(5).horariosPadrao();
	}*/
	public Sala(int numero) {
		this.numero = numero;
	}
	public String toString() {
		return "SALA " + numero;
	}
	public void setNumero(int n) {
		this.numero = n;
	}
	public int getNumero() {
		return this.numero;
	}
}
