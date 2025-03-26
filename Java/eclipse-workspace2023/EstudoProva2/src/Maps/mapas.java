package Maps;
import java.util.HashMap;
import java.util.Map;

import serializacao.Conta;

public class mapas {
	public static  void main(String[] args) {
	Map<Integer, Conta> contas = new HashMap<>();
	
	Conta c = new Conta();
	
	contas.put(1,c);
	
	}
}
