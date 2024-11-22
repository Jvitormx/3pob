package exer4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_1 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<String> nomes = new ArrayList<>();
	        List<Double> alturas = new ArrayList<>();

	        for (int i = 1; i <= 50; i++) {
	            System.out.print("Digite o nome da pessoa " + i + ": ");
	            nomes.add(scanner.nextLine());
	            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
	            alturas.add(scanner.nextDouble());
	            scanner.nextLine(); // Consumir a quebra de linha
	        }

	        System.out.println("Pessoas com altura maior que 1,70 metros:");
	        for (int i = 0; i < nomes.size(); i++) {
	            if (alturas.get(i) > 1.70) {
	                System.out.printf("Nome: %s, Altura: %.2f metros%n", nomes.get(i), alturas.get(i));
	            }
	        }

	        scanner.close();
	    }

}
