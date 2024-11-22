package exer4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_3 {

	  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> codigos = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<String> telefones = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o código da pessoa " + i + ": ");
            codigos.add(scanner.nextInt());
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite o telefone da pessoa " + i + ": ");
            telefones.add(scanner.nextLine());
        }

        while (true) {
            System.out.print("Digite o código da pessoa para consulta (ou 0 para sair): ");
            int codigoConsulta = scanner.nextInt();

            if (codigoConsulta == 0) {
                break;
            }

            int index = -1;
            for (int i = 0; i < codigos.size(); i++) {
                if (codigos.get(i) == codigoConsulta) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Nome: " + nomes.get(index));
                System.out.println("Telefone: " + telefones.get(index));
            } else {
                System.out.println("Pessoa não encontrada.");
            }

            scanner.nextLine(); // Consumir a quebra de linha
        }

        scanner.close();
    }

}
