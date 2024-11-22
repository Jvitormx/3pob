package exer4_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exer4_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        List<Integer> crescente = new ArrayList<>(numeros);
        Collections.sort(crescente);

        List<Integer> decrescente = new ArrayList<>(numeros);
        decrescente.sort(Collections.reverseOrder());

        System.out.println("Números em ordem crescente: " + crescente);
        System.out.println("Números em ordem decrescente: " + decrescente);

        scanner.close();
    }

}
