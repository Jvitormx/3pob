package exer3_5;
import java.util.Scanner;

public class exer3_5 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("quantidade de pessoas: ");
		
		int pessoas = scan.nextInt();
		
		int inf1_60 = 0;
		int entre1_60_1_80 = 0;
		int sup1_80 = 0;
		
		double altura;
		
		for(int i=0;i<pessoas;i++)
		{
			System.out.print("altura: ");
			altura = scan.nextDouble();
			
			if(altura < 1.60)
			{
				inf1_60 += 1;
			}else if(altura < 1.80)
			{
				entre1_60_1_80 += 1;
			}else {
				sup1_80 += 1;
			}
		}
		
		System.out.println("menor que 1.60: "+ inf1_60);
		System.out.println("entre 1.60 e 1.80: "+ entre1_60_1_80);
		System.out.println("maior que 1.80: "+ sup1_80);


	}

}
