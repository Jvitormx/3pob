package exer1_5;
import java.util.Scanner;

public class exer1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da equipe: ");
        String nomeEquipe = scanner.nextLine();

        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite a quantidade de empates: ");
        int empates = scanner.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        int pontosGanhos = (vitorias * 3) + empates;
        int jogosTotais = vitorias + empates + derrotas;
        int pontosTotaisPossiveis = jogosTotais * 3;
        int pontosPerdidos = pontosTotaisPossiveis - pontosGanhos;

        System.out.println("\nResultados da equipe " + nomeEquipe + ":");
        System.out.println("Pontos ganhos: " + pontosGanhos);
        System.out.println("Pontos perdidos: " + pontosPerdidos);

        scanner.close();

	}

}
