package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import exceptions.ClienteJaCadastrado;
import exceptions.ExcecaoDeCarroJaCadastrado;

public class LocadoraAutomoveis implements Serializable{
	
	private List<Cliente> listaClientes = new LinkedList();
	private List<Carro> listaCarros = new LinkedList();

	
	public void limpaListaClientes()
	{
		this.listaClientes.clear();
	}
	
	public void adicionaCliente(Cliente newCliente) throws ClienteJaCadastrado
	{
		
		for(Cliente c: listaClientes)
		{
			if(newCliente.getCpf().equalsIgnoreCase(c.getCpf()))
			{
				throw new ClienteJaCadastrado();
			}
		}
		
		listaClientes.add(newCliente);
		
	}
	
	/**
	 * Método para adicionar novos clientes, caso o CPF já esteja cadastrado no sistema o método lança uma exceção para indiicar o erro
	 * @param newCarro
	 * @throws ExcecaoDeCarroJaCadastrado
	 */
	public void adicionaCarro(Carro newCarro) throws ExcecaoDeCarroJaCadastrado
	{
		
		for(Carro c: listaCarros)
		{
			if(newCarro.getPlaca().equalsIgnoreCase(c.getPlaca()))
			{
				throw new ExcecaoDeCarroJaCadastrado();
			}
		}
		
		listaCarros.add(newCarro);
		
	}
	
	
	public List<Cliente> mostraTodosClientes()
	{
		
		if(!listaClientes.isEmpty())
		{
			return listaClientes;
		}
		
		return null;
	}
	
	/**
	 * Método para mostrar todos os carros cadastrados.
	 * @return lista con os carros cadastrados.
	 * @return null se não houver carros cadastrados.
	 */
	public List<Carro> mostraTodosCarros() {
	if(!listaCarros.isEmpty()) {
			return listaCarros;
		}
	return null;
		
	}
	

}
