package exer2_9;
import java.util.Scanner;

public class exer2_9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Entrada dos valores dos lados do triângulo
	        System.out.print("Digite o valor do lado X: ");
	        int X = scanner.nextInt();
	        System.out.print("Digite o valor do lado Y: ");
	        int Y = scanner.nextInt();
	        System.out.print("Digite o valor do lado Z: ");
	        int Z = scanner.nextInt();

	        // Verificando se é um triângulo válido
	        if (X + Y > Z && X + Z > Y && Y + Z > X) {
	            // Triângulo válido, verificar o tipo
	            if (X == Y && Y == Z) {
	                System.out.println("Triângulo Equilátero");
	            } else if (X == Y || Y == Z || X == Z) {
	                System.out.println("Triângulo Isósceles");
	            } else {
	                System.out.println("Triângulo Escaleno");
	            }
	        } else {
	            // Não é um triângulo válido
	            System.out.println("Não é um triângulo válido");
	        }

	        scanner.close();

	}

}
