package exer3_10;
import java.util.Scanner;

public class exer3_10 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("quantidade de numeros: ");
		int numeros = scan.nextInt();
		int num, pares = 0, imp = 0;
		
		for(int i=0;i<numeros;i++)
		{
			System.out.print("num: ");
			num = scan.nextInt();
			
			if(num%2==0)
			{
				pares += 1;
			}else {
				imp += 1;
			}
		}
		
		System.out.print("Foram lidos: " + numeros + " pares: " + pares + " impares: " + imp);
	}


}
