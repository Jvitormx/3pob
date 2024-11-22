package exer4_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Nome do aluno " + i + ": ");
            String nome = scanner.nextLine();
            System.out.print("Nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine();
            nomes.add(nome);
            notas.add(nota);
        }

        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }

        double media = somaNotas / notas.size();

        System.out.printf("Nota média da turma: %.2f%n", media);
        System.out.println("Alunos com nota superior à média:");

        for (int i = 0; i < nomes.size(); i++) {
            if (notas.get(i) > media) {
                System.out.printf("Nome: %s, Nota: %.2f%n", nomes.get(i), notas.get(i));
            }
        }

        scanner.close();

	}

}
