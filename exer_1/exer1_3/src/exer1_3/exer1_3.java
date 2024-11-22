package exer1_3;
import java.util.Scanner;

public class exer1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        String codigoTurma = scanner.nextLine();

        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int qtdMasculino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int qtdFeminino = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos aprovados: ");
        int qtdAprovados = scanner.nextInt();

        int totalAlunos = qtdMasculino + qtdFeminino;

        int qtdReprovados = totalAlunos - qtdAprovados;

        double percMasculino = (double) qtdMasculino / totalAlunos * 100;
        double percFeminino = (double) qtdFeminino / totalAlunos * 100;
        double percReprovados = (double) qtdReprovados / totalAlunos * 100;

        System.out.println("\nEstatísticas da Turma " + codigoTurma + ":");
        System.out.printf("Total de alunos: %d%n", totalAlunos);
        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%%n", percMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%%n", percFeminino);
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%%n", percReprovados);

        scanner.close();

	}

}
