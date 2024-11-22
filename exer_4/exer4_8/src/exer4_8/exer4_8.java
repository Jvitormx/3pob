package exer4_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer4_8 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(scanner.nextInt());
        }

        int maior = numeros.get(0);
        int ocorrencias = 0;
        List<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
                ocorrencias = 1;
                posicoes.clear();
                posicoes.add(i);
            } else if (numeros.get(i) == maior) {
                ocorrencias++;
                posicoes.add(i);
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Quantidade de ocorrências: " + ocorrencias);
        System.out.println("Posições: " + posicoes);

        scanner.close();
    }

}
