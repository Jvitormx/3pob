package exer1_1;
import java.util.Scanner;

public class Exer1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do primeiro empregado: ");
        String matricula1 = scanner.nextLine();

        System.out.print("Digite o salário do primeiro empregado: ");
        double salario1 = scanner.nextDouble();

        scanner.nextLine(); 
        System.out.print("Digite a matrícula do segundo empregado: ");
        String matricula2 = scanner.nextLine();

        System.out.print("Digite o salário do segundo empregado: ");
        double salario2 = scanner.nextDouble();

       
        double desconto1 = salario1 * 0.05;
        double salarioFinal1 = salario1 - desconto1;

        
        double acrescimo2 = salario2 * 0.09;
        double salarioFinal2 = salario2 + acrescimo2;

        System.out.println("\nResultados:");
        System.out.printf("Matrícula do primeiro empregado: %s%n", matricula1);
        System.out.printf("Desconto no salário do primeiro empregado: R$ %.2f%n", desconto1);
        System.out.printf("Salário final do primeiro empregado: R$ %.2f%n", salarioFinal1);

        System.out.printf("\nMatrícula do segundo empregado: %s%n", matricula2);
        System.out.printf("Acréscimo no salário do segundo empregado: R$ %.2f%n", acrescimo2);
        System.out.printf("Salário final do segundo empregado: R$ %.2f%n", salarioFinal2);

        scanner.close();
	}

}
