package exer4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> matriculas = new ArrayList<>();
        List<Double> salariosBrutos = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite a matrícula do empregado " + i + ": ");
            matriculas.add(scanner.nextInt());
            System.out.print("Digite o salário bruto do empregado " + i + ": ");
            salariosBrutos.add(scanner.nextDouble());
        }

        System.out.println("Relatório de salários após desconto:");

        for (int i = 0; i < 100; i++) {
            int matricula = matriculas.get(i);
            double salarioBruto = salariosBrutos.get(i);
            double desconto = salarioBruto * 0.11;
            double salarioLiquido = salarioBruto - desconto;

            System.out.printf("Matrícula: %d, Salário Bruto: %.2f, Desconto: %.2f, Salário Líquido: %.2f%n",
                    matricula, salarioBruto, desconto, salarioLiquido);
        }

        scanner.close();
    }

}
