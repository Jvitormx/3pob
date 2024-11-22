package exer3_1;
import java.util.Scanner;

public class exer3_1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        double somatorio = 0;

	        // Lê os preços dos 10 produtos
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o preço do produto " + i + ": ");
	            double preco = scanner.nextDouble();
	            somatorio += preco;  // Adiciona o preço ao somatório
	        }

	        // Exibe o somatório dos preços
	        System.out.println("O somatório dos preços dos produtos é: R$ " + somatorio);

	        scanner.close();
	}

}
