package exer3_6;
import java.util.Scanner;


public class exer3_6 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("quantidade de pessoas: ");
		
		int pessoas = scan.nextInt();
		
		int idade;
		int menor18 = 0;
		int maiorIgual18 = 0;
		
		
		for(int i=0;i<pessoas;i++)
		{
			System.out.print("idade: ");
			idade = scan.nextInt();
			
			if(idade>18)
			{
				menor18 += 1;
			}else {
				maiorIgual18 += 1;
			}
		}
		
		double porcMenor18 = (menor18/100.00) * 100;
		double porcMaiorIgual18 = (maiorIgual18/100.00) * 100;
		
		System.out.print("menor que 18: "+ porcMenor18 + "% maior que 18: " + porcMaiorIgual18 + "%");

	}

}
