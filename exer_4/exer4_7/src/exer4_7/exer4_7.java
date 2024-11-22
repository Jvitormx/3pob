package exer4_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> quadrados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            quadrados.add(numero * numero);
        }

        System.out.println("Números ao quadrado: " + quadrados);

        scanner.close();
    }

}
