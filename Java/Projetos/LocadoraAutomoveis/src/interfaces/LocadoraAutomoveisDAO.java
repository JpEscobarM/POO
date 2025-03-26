package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.LocadoraAutomoveis;

public interface LocadoraAutomoveisDAO {
	
	public LocadoraAutomoveis carregaArquivo(String caminhoArquivo) throws FileNotFoundException, IOException, ClassNotFoundException;
	
	public boolean salvarNoArquivo(LocadoraAutomoveis lc, String caminhoArquivo);
	
}
