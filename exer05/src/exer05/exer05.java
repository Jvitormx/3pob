package exer05;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da equipe: ");
        String equipe = scanner.nextLine();

        System.out.print("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite o número de empates: ");
        int empates = scanner.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        int pontosGanhos = (vitorias * 3) + empates;
        int pontosPerdidos = (empates * 2) + (derrotas * 3);

        System.out.println("Equipe: " + equipe);
        System.out.println("Pontos ganhos: " + pontosGanhos);
        System.out.println("Pontos perdidos: " + pontosPerdidos);

	}

}
