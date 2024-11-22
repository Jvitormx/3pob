package exer2_3;
import java.util.Scanner;

public class exer2_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("nome: ");
		String nome = scan.nextLine();
		System.out.print("nota1: ");
		float nota1 = scan.nextFloat();
		System.out.print("nota2: ");
		float nota2 = scan.nextFloat();
		
		float media=(nota1+nota2)/2;
		
		if(media>=7)
		{
			System.out.println("aprovado");
		}else {
			System.out.println("reprovado");
		}

	}

}
