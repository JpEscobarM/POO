package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        // Definindo o formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data (dd/mm/aaaa):");

        // Lê a data no formato dd/mm/aaaa
        String dataString = in.nextLine().trim();  // Adicionando .trim() para limpar espaços extras

        try {
            // Converte a string para LocalDate
            LocalDate dataInicio = LocalDate.parse(dataString, formatter);

            // Data final de exemplo
            LocalDate dataFim = LocalDate.of(2024, 11, 1);

            // Calculando a diferença em dias entre as duas datas
            long diasDeDiferenca = ChronoUnit.DAYS.between(dataInicio, dataFim);

            // Exibindo as datas e a diferença
            System.out.println("Data de Início: " + dataInicio);
            System.out.println("Data Final: " + dataFim);
            System.out.println("Diferença em dias: " + diasDeDiferenca + " dias");
        } catch (Exception e) {
            System.out.println("Erro ao parsear a data. Verifique o formato dd/MM/yyyy.");
        }
    }
}
