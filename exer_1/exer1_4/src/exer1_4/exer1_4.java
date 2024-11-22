package exer1_4;
import java.util.Scanner;

public class exer1_4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o total de games vendidos: ");
	        int totalGames = scanner.nextInt();

	        System.out.print("Digite o preço de cada game: ");
	        double precoGame = scanner.nextDouble();

	        System.out.print("Digite o total de calculadoras vendidas: ");
	        int totalCalculadoras = scanner.nextInt();

	        System.out.print("Digite o preço de cada calculadora: ");
	        double precoCalculadora = scanner.nextDouble();

	        System.out.print("Digite o total de canetas vendidas: ");
	        int totalCanetas = scanner.nextInt();

	        System.out.print("Digite o preço de cada caneta: ");
	        double precoCaneta = scanner.nextDouble();

	        double faturamentoGames = totalGames * precoGame;
	        double faturamentoCalculadoras = totalCalculadoras * precoCalculadora;
	        double faturamentoCanetas = totalCanetas * precoCaneta;

	        double faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;

	        System.out.printf("%nFaturamento diário:%n");
	        System.out.printf("Games: R$ %.2f%n", faturamentoGames);
	        System.out.printf("Calculadoras: R$ %.2f%n", faturamentoCalculadoras);
	        System.out.printf("Canetas: R$ %.2f%n", faturamentoCanetas);
	        System.out.printf("Faturamento total: R$ %.2f%n", faturamentoTotal);

	        scanner.close();

	}

}
