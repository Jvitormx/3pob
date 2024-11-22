package exer4_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> numeros = new ArrayList<>();

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            int numero = scanner.nextInt();
	            numeros.add(numero);
	        }

	        int positivos = 0;
	        int negativos = 0;
	        int nulos = 0;

	        for (int numero : numeros) {
	            if (numero > 0) {
	                positivos++;
	            } else if (numero < 0) {
	                negativos++;
	            } else {
	                nulos++;
	            }
	        }

	        System.out.println("Quantidade de números positivos: " + positivos);
	        System.out.println("Quantidade de números negativos: " + negativos);
	        System.out.println("Quantidade de números nulos: " + nulos);

	        scanner.close();
	    }
}
