package exer1_2;
import java.util.Scanner;

public class exer1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);

        scanner.close();

	}

}
