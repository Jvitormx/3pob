package exer2_4;
import java.util.Scanner;

public class exer2_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("nome: ");
		String nome = scan.nextLine();
		System.out.print("sexo: ");
		String sexo = scan.nextLine();
		System.out.print("salario bruto: ");
		float salario = scan.nextFloat();
		
		double desconto;
		
		if(sexo.equals("masc"))
		{
			desconto=salario*(5.0/100);
			salario-=desconto;
		}else {
			desconto=salario*(3.0/100);
			salario-=desconto;
		}
		
		System.out.println("desconto: "+ desconto);
		System.out.println("salario liquido: "+ salario);

	}

}
