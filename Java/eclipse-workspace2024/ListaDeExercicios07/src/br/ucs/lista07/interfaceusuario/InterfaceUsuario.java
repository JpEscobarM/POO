package br.ucs.lista07.interfaceusuario;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.ucs.lista07.entities.Funcionario;
import br.ucs.lista07.interfaces.Colaborador;

public class InterfaceUsuario {
	
	
	
	
	
	
	public static void interfaceUsuario()
	{
		
		Scanner input = new Scanner(System.in);
		List<Colaborador> colaboradores = new LinkedList();
		
		
		int menu = 1;

		
		while(menu != 0 )
		{
			System.out.println("Teste");
			
			menu = input.nextInt();
			
			switch (menu)
			{
			case 1:
				
				
				Funcionario cadastroFuncionario = new Funcionario();
				
				
				cadastroFuncionario.setNome(input.nextLine());
				
				
				colaboradores.add(cadastroFuncionario);
				
				System.out.println(colaboradores.get(0));
				
				
			break;
			}
			
				
		}
		
	}
	
}
