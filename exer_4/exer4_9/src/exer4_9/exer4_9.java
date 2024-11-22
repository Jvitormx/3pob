package exer4_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        List<Integer> listaA = new ArrayList<>();
	        List<Integer> listaB = new ArrayList<>();
	        List<Integer> listaC = new ArrayList<>();

	        System.out.println("Preencha a Lista A:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + " para a Lista A: ");
	            listaA.add(scanner.nextInt());
	        }

	        System.out.println("Preencha a Lista B:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + " para a Lista B: ");
	            listaB.add(scanner.nextInt());
	        }

	        for (int i = 0; i < 10; i++) {
	            listaC.add(listaA.get(i) + listaB.get(i));
	        }

	        System.out.println("Conteúdo da Lista C (soma de A e B): " + listaC);

	        scanner.close();

	}

}
