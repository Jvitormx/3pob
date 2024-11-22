package exer3_4;
import java.util.Scanner;

public class exer3_4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("quantidade de pessoas: ");
		int pessoas = scan.nextInt();
		int masc = 0;
		int fem = 0;
		String sexo;
		
		for(int i=0;i<pessoas;i++)
		{
			System.out.println("sexo: ");
			sexo = scan.nextLine();
			
			if(sexo.equals("masc"))
			{
				masc += 1;
			}else {
				fem += 1;
			}
		}
		
		System.out.println("Foram entrevistadas " + pessoas);
		System.out.println(masc + " masculinas | " + fem + " femininas");
	}

}
