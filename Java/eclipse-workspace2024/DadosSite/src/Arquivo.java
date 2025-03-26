
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Arquivo {
	
	
	public static void escreveExcel(List<Empresa> empresas, String excelPath)
	{
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Empresas");
		
		String[] headers = {"NOME","ENDEREÇO","BAIRRO","CIDADE","ESTADO","TELEFONE","EMAIL"};
		
		Row headerRow = sheet.createRow(0);
		
		for(int i = 0 ; i < headers.length; i++)
		{
			
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(headers[i]);
			
			
		}
		
		int rowNum = 1;
        for (Empresa empresa : empresas) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(empresa.getNome());
            row.createCell(1).setCellValue(empresa.getEndereco());
            row.createCell(2).setCellValue(empresa.getBairro());
            row.createCell(3).setCellValue(empresa.getCidade());
            row.createCell(4).setCellValue(empresa.getEstado());
            row.createCell(5).setCellValue(empresa.getTelefone());
            row.createCell(6).setCellValue(empresa.getEmail());
        }
        
        try(FileOutputStream fileOut = new FileOutputStream(excelPath))
        {
        	workbook.write(fileOut);
        	System.out.println("Dados escritos com sucesso em " + excelPath);
        	
        }
        catch(IOException e)
        {
        	  System.out.println("Erro ao escrever no arquivo Excel: " + e.getMessage());
        }finally
        {
        	try {
        		workbook.close();
        	}
        	catch(IOException e)
        	{
        		e.printStackTrace();
        	}
        }
        
	}
	
	
}
