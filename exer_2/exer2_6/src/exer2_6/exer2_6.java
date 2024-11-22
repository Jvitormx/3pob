package exer2_6;
import java.util.Scanner;

public class exer2_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("salario minimo: ");
		double salarioMin = scan.nextDouble();
		System.out.print("nome: ");
		String nome = scan.nextLine();
		System.out.print("Salario bruto de "+nome+" :");
		double salarioBrut = scan.nextDouble();
		
		double desconto;
		double salarioLiq = salarioBrut;
		
		if(salarioBrut<salarioMin)
		{
			desconto = salarioBrut*(2.0/100);
			salarioLiq -= desconto;
		}else if(salarioBrut > salarioMin)
		{
			desconto = salarioBrut*(8.0/100);
			salarioLiq -= desconto;
		}else {
			desconto = salarioBrut*(5.0/100);
			salarioLiq -= desconto;
		}
		
		System.out.print("salario liquido: "+salarioLiq);
		System.out.print("Desconto: "+desconto);

	}

}
