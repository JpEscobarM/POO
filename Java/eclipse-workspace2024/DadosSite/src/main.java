import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class main {

	  public static void main(String[] args) {

	        String nome = null;
	        String bairro = null;
	        String email = null;
	        String cidade = null;
	        String endereco = null;
	        String estado = null;
	        String telefone = null;
	        
	        List<Empresa> empresas = new LinkedList();
	        
	        Empresa emp = new Empresa();
	        
	        try {
	            // Configura o scanner para ler o arquivo linha por linha
	            Scanner input = new Scanner(new FileReader("C:\\Users\\jmartins\\eclipse-workspace2024\\DadosSite\\archive\\Assistencia Tecnica.txt"))
	                    .useDelimiter("\\n");

	            while (input.hasNext()) {
	                String linha = input.next().trim();

	                if (linha.matches(".*@.*")) { //email é a ultima informação lida de uma empresa
	                    email = linha; // Captura o e-mail
	                    emp.setEmail(email);
	                    
	                    empresas.add(emp); //adiciona a lista
	                    
	                    emp = new Empresa();
	                    
	                } else if (linha.matches(".*\\(\\d{2}\\).*")) {
	                    telefone = linha; // Captura o telefone
	                    emp.setTelefone(telefone);
	                    
	                } else if (linha.startsWith("Estado:")) {
	                    Pattern pattern = Pattern.compile("Estado: (\\w{2}) / Cidade: (.+)"); // Corrigido regex
	                    Matcher matcher = pattern.matcher(linha);
	                    if (matcher.find()) {
	                        estado = matcher.group(1);
	                        cidade = matcher.group(2);
	                        
	                        emp.setCidade(cidade);
	                        emp.setEstado(estado);
	                        
	                        
	                    }
	                } else if (linha.startsWith("Bairro:")) {
	                    bairro = linha.replace("Bairro:", "").trim(); // Captura o bairro
	                    emp.setBairro(bairro);
	                    
	                } else if (linha.startsWith("Endereço:")) {
	                    endereco = linha.replace("Endereço:", "").trim(); // Captura o endereço
	                    emp.setEndereco(endereco);
	                    
	                } else if(!linha.isEmpty()) {
	                    nome = linha; // Assume qualquer outra linha como nome
	                    emp.setNome(nome);
	                    
	                }
	            }

	          
	            
	            
	            // Fecha o scanner após leitura
	            input.close();

	          

	        } catch (FileNotFoundException e) {
	            System.out.println("Arquivo não encontrado");
	        }
	        
	        String excelPath = "C:\\Users\\jmartins\\eclipse-workspace2024\\DadosSite\\archive\\ATecnica.xlsx";
	        
	        Arquivo.escreveExcel(empresas, excelPath);
	        
	    }
	}