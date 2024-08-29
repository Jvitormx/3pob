package exer03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exer03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o código da turma: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int masculino = scanner.nextInt();
        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int feminino = scanner.nextInt();
        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        int totalAlunos = masculino + feminino;
        int reprovados = totalAlunos - aprovados;

        double percentualMasculino = (masculino * 100.0) / totalAlunos;
        double percentualFeminino = (feminino * 100.0) / totalAlunos;
        double percentualReprovados = (reprovados * 100.0) / totalAlunos;

        System.out.println("Porcentagem de alunos do sexo masculino: " + df.format(percentualMasculino) + "%");
        System.out.println("Porcentagem de alunos do sexo feminino: " + df.format(percentualFeminino) + "%");
        System.out.println("Porcentagem de alunos reprovados: " + df.format(percentualReprovados) + "%");
        System.out.println("Total de alunos na turma: " + totalAlunos);

	}

}
