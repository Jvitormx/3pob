package exer3_11;
import java.util.Scanner;

public class exer3_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a massa inicial do material em gramas: ");
        double massa = scanner.nextDouble();

        int tempo = 0;
        double limiteMassa = 0.5;

        while (massa >= limiteMassa) {
            massa /= 2;  
            tempo += 50; 
        }

        System.out.println("A massa final é: " + massa + " gramas");
        System.out.println("O tempo necessário para a massa ser menor que 0.5 gramas é: " + tempo + " segundos");

        scanner.close();

	}

}
