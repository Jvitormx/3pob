package exer3_8;
import java.util.Scanner;

public class exer3_8 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String nome;
		String nomeMaisAlto = null;
		
		double altura, alturaMedia = 0, alturaMaior = -9999;
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print("nome: ");
			nome = scan.nextLine();
			
			System.out.print("altura: ");
			altura = scan.nextDouble();
			
			alturaMedia += altura;
			
			if(altura > alturaMaior)
			{
				alturaMaior = altura;
				nomeMaisAlto = nome;
			}
		}
		
		alturaMedia /= 10;
		
		System.out.print("mais alto: " + nomeMaisAlto + "altura: " + alturaMaior);

	}

}
