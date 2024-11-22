package exer3_3;
import java.util.Scanner;

public class exe3_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int somaIdade = 0;
		
		for(int i=0;i<10;i++)
		{
			System.out.print("idade: ");
			somaIdade += scan.nextInt();
		}
		
		double media = somaIdade/10;
		
		System.out.print("media: "+media);

	}

}
