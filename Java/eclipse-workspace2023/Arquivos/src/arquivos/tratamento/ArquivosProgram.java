package arquivos.tratamento;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivosProgram {
	public static void main(String[] args) {
		File file =  new File ("c:\\temp\\in.txt");
//	Scanner input= new Scanner(System.in);  ler arquivos do telcado
		Scanner input = null;
		try {
		 input = new Scanner (file); //Instancia a varialvel "apontando" para o arquivo de texto
		 
 //While para percorrer o arquivo utiliza a função do scanner .hasNextline() 
 //essa função faz o while durar enquanto ainda tiver algo para ler no arquivo
		 while(input.hasNextLine()) { 
			String line = input.nextLine();
			System.out.println(line);
			
		 	}
		 
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (input != null) {
				input.close();	
			}
			
		}
		
	}
}	
