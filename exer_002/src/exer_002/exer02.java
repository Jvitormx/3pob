package exer_002;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exer02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5.0/9.0 * (fahrenheit - 32);

        System.out.println("A temperatura em Celsius é: " + df.format(celsius));

	}

}
