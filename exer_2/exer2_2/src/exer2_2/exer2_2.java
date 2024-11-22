package exer2_2;
import java.util.Scanner;

public class exer2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anoAtual, anoNascimento;
		
		System.out.print("ano atual: ");
		anoAtual = scan.nextInt();
		
		System.out.print("ano nascimento: ");
		anoNascimento = scan.nextInt();
		
		int idade=anoAtual-anoNascimento;
		
		System.out.println("idade: "+idade);
	}

	}

