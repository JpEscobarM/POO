package persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import interfaces.LocadoraAutomoveisDAO;
import model.LocadoraAutomoveis;
/**
 * Classe utilizada para a persistencia de arquvios por meio de serialização de dados, implementa o design DAO (data acess object)
 * para organizar o acesso e manipulação dos dados
 * @author joao
 * @author wpsilva
 * @version 20/11/2024
 */
public class LocadoraAutomoveisSerializacaoDAO implements LocadoraAutomoveisDAO{
	
	/**Método utilizado para carregar os arquivos salvos para dentro do programa para poderem ser manipulados corretamente, recebe uma
	 * String "caminhoArquivo" que é objetivamente o caminho das pastas onde se localiza o arquivo serializado no computador, retorna
	 * um objeto da classe LocadoraAutomoveis.
	 * @return LocadoraAutomoveis
	 * @param String 
	 * @category Método
	 * @author João 
	 * @author wpsilva
	 */
	@Override
	public LocadoraAutomoveis carregaArquivo(String caminhoArquivo) {
		
		LocadoraAutomoveis locadora = null;
		
		try(	FileInputStream fi = new FileInputStream(caminhoArquivo);
		ObjectInputStream oi = new ObjectInputStream(fi);) {
			
	
		Object o = oi.readObject();
		locadora = (LocadoraAutomoveis) o;
		
		
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return locadora;
		
	}

	/**Metodo utilizado para serializar e salvar os arquivos em determinado local dentro das pastas do sistema, recebe um objeto da classe
	 * LocadoraAutomoveis e uma String caminhoArquivo que indica onde serão salvos os respectivos dados.
	 * 
	 * @param LocadoraAutomoveis
	 * @param String 
	 * @return True caso seja salvo corretamente
	 * @return False caso não tenha conseguido salvar o arquivo
	 * @author João Paulo Escobar
	 * @author wpsilva
	 */
	@Override
	public boolean salvarNoArquivo(LocadoraAutomoveis lc, String caminhoArquivo) {
		// TODO Auto-generated method stub
		
		try (FileOutputStream fo = new FileOutputStream(caminhoArquivo);
				ObjectOutputStream ou = new ObjectOutputStream(fo);){
			
			ou.writeObject(lc);
			return true;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
return false;
		
	}

	

}
