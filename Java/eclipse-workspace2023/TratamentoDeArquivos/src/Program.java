import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Product> produtos = new ArrayList();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = input.nextLine();
		input.nextLine();
		
		File sourceFile = new File (sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr+ "\\out").mkdir();
		
		input.close();
	}
}
