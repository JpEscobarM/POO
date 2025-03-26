package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import exceptions.ExcecaoClienteJaCadastrado;
import exceptions.ExcecaoDeCarroJaCadastrado;
import exceptions.ExcecaoEntradaNaoIdentificada;
import exceptions.ExcecaoNenhumCarroAlugado;
import exceptions.ExcecaoNenhumCarroDisponivel;
import exceptions.ExcecaoNenhumClienteCadastrado;
/**
 * Esta classe representa a locadora de carros, gerenciando listas de clientes , carros e a lista de carros alugados.[
 * @author João
 * @author wpsilva
 * @version 20/11/24
 */
public class LocadoraAutomoveis implements Serializable{

	
	private List<Cliente> listaClientes = new LinkedList<Cliente>();
	private List<Carro> listaCarros = new LinkedList<Carro>();
	private List<CarroAlugado> listaAlugados = new LinkedList<CarroAlugado>();

	private int dias;
	//métodos acessores
	
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	//métodos implementados
	/**
	 * Método para buscar um cliente dentro da lista de cliente através do cpf.
	 * @param cpf
	 * @return Cliente
	 * @return null se o cliente nao foi encontrado.
	 */
	public Cliente BuscarCliente(String cpf) {
	if(!listaClientes.isEmpty()) {
		for(Cliente c:listaClientes) {
			if(c.getCpf().equals(cpf)) {
				return c;
			}
		}
			
		}
	return null;
		
	}
	/**
	 * Método para adicionar um novo cliente para a lista de clientes.
	 * @param newCliente
	 * @throws ExcecaoClienteJaCadastrado se houver cliente com o mesmo cpf.
	 */
	public void adicionaCliente(Cliente newCliente) throws ExcecaoClienteJaCadastrado
	{
		
		for(Cliente c: listaClientes)
		{
			if(newCliente.getCpf().equalsIgnoreCase(c.getCpf()))
			{
				throw new ExcecaoClienteJaCadastrado();
			}
		}
		
		listaClientes.add(newCliente);
		
	}
	/**
	 * Método para mostrar todo os clientes cadastrados.
	 * @return lista com todos os clientes cadastrados.
	 * @throws ExcecaoNenhumClienteCadastrado
	 */
	public List<Cliente> mostrarClientes() throws ExcecaoNenhumClienteCadastrado{
	if(listaClientes==null || listaClientes.isEmpty()) {
			 throw new ExcecaoNenhumClienteCadastrado();
		}else {
			return listaClientes;
		}
	}
	
	
	/**
	 * Método para desvincular um veiculo de um cliente.
	 * @param ca
	 * @return true se foi desvinculado com sucesso.
	 * @return false se não foi desvinculado .
	 */
	public boolean removerAlugado(CarroAlugado ca) {
		if(listaAlugados.contains(ca)) {
		this.listaAlugados.remove(ca);
	return true;
	}
		return false;
	}
	/**
	 * Método para bucar dentro da lista de carros um objeto CarroAlugado;
	 * @param carro
	 * @return CarroAlugado quando encotrado.
	 * @throws ExcecaoNenhumCarroAlugado
	 */
	public CarroAlugado bucarAlugado(Carro carro) throws ExcecaoNenhumCarroAlugado{
		
		if(listaAlugados==null ||listaAlugados.isEmpty()) {
			throw new ExcecaoNenhumCarroAlugado();
		}
		for(CarroAlugado ca:listaAlugados) {
			if(ca.getCarro().equals(carro)) {
				return ca;
				
			}
			
		
	
	}
		return null;
		}
	/**
	 * Método para inclusão de um objeto do tipo CarroAlugado a uma lista.
	 * @param ca
	 */
	public void adicionarNovoAlugado(CarroAlugado ca) {
		if(ca!=null) {
			listaAlugados.add(ca);
	}
	}
	
	/**
	 * Método para buscar um carro pela String da placa.
	 * @param placa
	 * @return um objeto Carro.
	 * @throws ExcecaoNenhumCarroDisponivel
	 */
	public Carro buscarCarro(String placa) throws ExcecaoNenhumCarroDisponivel{
		if(listaCarros==null) {
			throw new ExcecaoNenhumCarroDisponivel();
		}
		for(Carro c:listaCarros) {
			if(c.getPlaca().equalsIgnoreCase(placa)) {
				
				return c;
			}
		
	
	}
		return null;
	}
	/**
	 * Método para buscar um carro atraves de um int.
	 * @param indice com valor inteiro.
	 * @return um objeto do tipo Carro.
	 * @throws ExcecaoNenhumCarroDisponivel se a lista de carros estiver vazio
	 * @throws ExcecaoEntradaNaoIdentificada caso algum argumento inválido.
	 */
	public Carro buscarCarro(int indice)throws ExcecaoNenhumCarroDisponivel,ExcecaoEntradaNaoIdentificada {
		if(listaCarros==null) {
			throw new ExcecaoNenhumCarroDisponivel();
		}
		if(indice>=0 && indice<listaCarros.size()) {
		return listaCarros.get(indice);
		}
		throw new ExcecaoEntradaNaoIdentificada();
	
	}

	

	/**
	 * Método para adicionar um novo carro a uma lista de carros cadastrados.
	 * @param newCarro
	 * @throws ExcecaoDeCarroJaCadastrado se placa castrada for igual a alguma que ja está contida no sistema.
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
	/**
	 * Método para buscar carros que estão em contratos.
	 * @param carro busca o objeto dentro da lista.
	 * @return CarroAlugado se for localizado dentro da lista de carros alugados.
	 * @throws ExcecaoNenhumCarroDisponivel se não for localizado
	 */
	public CarroAlugado buscarContratoAlugado(Carro carro)throws ExcecaoNenhumCarroDisponivel {
		 if(listaAlugados==null) {
			  throw new ExcecaoNenhumCarroDisponivel() ;
	
		 }
			
			 for (CarroAlugado c : listaAlugados) { 
			 if(c.getCarro().equals(carro)) {
			
			    return c;
			     
			
			 }
	}
			return null;
	
	}
	/**
	 * Método para mostrar todos os carros cadastrados.
	 * @return lista com os carros cadastrados.
	 * @return null se não houver carros cadastrados.
	 */
	public List<Carro> mostraTodosCarros()throws ExcecaoNenhumCarroDisponivel {
	if(listaCarros!=null && !listaCarros.isEmpty()) {
			return listaCarros;
		}else {
		  throw new ExcecaoNenhumCarroDisponivel();
		}	
	}
	/**
	 * Método para mostrar todos os carros que estão disponíveis para locação.
	 * @return lista com os carros disponíveis setados com diponiveis true.
	 * @return ExcecaoNenhumCarroDisponivel se a lista estiver null ou nehum carro cadastrado.
	 * @throws se não houver carros disponíveis 
	 */
	public List<Carro> buscarCarrosDisponiveis()throws ExcecaoNenhumCarroDisponivel {
		 if(listaCarros==null|| listaCarros.isEmpty() ){
			  throw new ExcecaoNenhumCarroDisponivel() ;
		
	}else {	 
			 List<Carro> carrosDisponiveis = new LinkedList<Carro>();

			 for (Carro c : listaCarros) { 
			 if(c.isDisponivel()) {
			
			         carrosDisponiveis.add(c);
			     
			 }
			 } if(carrosDisponiveis.isEmpty()) {
				 throw new ExcecaoNenhumCarroDisponivel() ;
			 }
			 return carrosDisponiveis;

		
	}
	}

		
	
	
}
