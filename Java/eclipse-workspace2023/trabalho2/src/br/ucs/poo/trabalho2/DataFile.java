package br.ucs.poo.trabalho2;
import java.io.*;
public class DataFile {
	
	public static Cinema carregaDados(String arquivo) throws IOException, ClassNotFoundException {
		
		Cinema cine = null;
		
		try { 
			FileInputStream fi = new FileInputStream(arquivo);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object o = oi.readObject();
			cine = (Cinema) o;
			oi.close();
			fi.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return cine;
		
	}
	
	public static boolean SalvarDados(Cinema cinema, String arquivo) {
		
		try {
			FileOutputStream fo = new FileOutputStream(arquivo);
			ObjectOutputStream ou = new ObjectOutputStream(fo);
			ou.writeObject(cinema);
			ou.close();
			fo.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return true; 
	}
	


}

