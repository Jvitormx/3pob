package exer3_7;
import java.util.Scanner;

public class exer3_7 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("quantos numeros inteiros: ");
		int numeros = scan.nextInt();
		
		int num, maior=-9999;
		
		for(int i=0;i<numeros;i++)
		{
			System.out.print("num: ");
			num = scan.nextInt();
			
			if(num>maior)
			{
				maior = num;
			}
		}
		
		System.out.print("maior: "+maior);

	}

}
