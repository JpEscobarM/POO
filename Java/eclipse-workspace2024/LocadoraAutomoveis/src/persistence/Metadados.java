package persistence;

import java.io.*;

import model.LocadoraAutomoveis;

public class Metadados {
	
	public static LocadoraAutomoveis carregaArquivo(String FilePath) throws IOException, ClassNotFoundException
	{
		
		LocadoraAutomoveis locadora = null;
		
		try {
			
		FileInputStream fi = new FileInputStream(FilePath);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object o = oi.readObject();
		locadora = (LocadoraAutomoveis) o;
		
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return locadora;
	}
	
	public static boolean salvarNoArquivo(LocadoraAutomoveis lc, String FilePath)
	{
		try {
			FileOutputStream fo = new FileOutputStream(FilePath);
			ObjectOutputStream ou = new ObjectOutputStream(fo);
			ou.writeObject(lc);
			ou.close();
			fo.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
}
