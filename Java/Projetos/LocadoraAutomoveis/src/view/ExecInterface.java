package view;

import exceptions.ExcecaoDataInvalida;
import exceptions.ExcecaoDeCarroJaCadastrado;
import exceptions.ExcecaoNenhumCarroAlugado;
import exceptions.ExcecaoNenhumCarroDisponivel;
import exceptions.ExcecaoNenhumClienteCadastrado;
public class ExecInterface {
	
	public static void main(String[] args) 
	
throws ExcecaoDeCarroJaCadastrado,
ExcecaoNenhumCarroDisponivel ,
ExcecaoNenhumClienteCadastrado,
ExcecaoNenhumCarroAlugado,
ExcecaoDataInvalida

{
		InterfaceUsuario.menu();
		
	}
	
}
