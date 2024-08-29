package exer04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exer04 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0.00");

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

	        System.out.println("Faturamento com games: R$ " + df.format(faturamentoGames));
	        System.out.println("Faturamento com calculadoras: R$ " + df.format(faturamentoCalculadoras));
	        System.out.println("Faturamento com canetas: R$ " + df.format(faturamentoCanetas));
	        System.out.println("Faturamento total: R$ " + df.format(faturamentoTotal));

	}

}
