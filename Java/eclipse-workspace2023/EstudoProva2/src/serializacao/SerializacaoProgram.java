package serializacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializacaoProgram  {
	
	public static String ARQUIVO = "arquivo.txt";
	
	public static void main(String[] args) throws ClassNotFoundException{
		Conta count = new Conta ("Pedro" , "020775780-17",200.90);
		
		File f = new File(ARQUIVO); //Abre um arquivo "ARQUIVO" 
		
		try {
			FileOutputStream fo = new FileOutputStream(f); //arquivo no modo output FileOutputStream ( f );
			ObjectOutputStream ou = new ObjectOutputStream (fo);
			ou.writeObject(count);
			

			ou.close();
			fo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		Conta c = new Conta();
		try {
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object o = oi.readObject();
			c = (Conta) o;
			oi.close();
			fi.close();
			System.out.println(c);
			
		}catch( IOException e) {
			e.printStackTrace();
		}
		
	}
}
