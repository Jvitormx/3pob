package exer2_8;
import java.util.Scanner;

public class exer2_8 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("codigo: ");
		String cod = scan.nextLine();
		System.out.print("quantidade: ");
		int quant = scan.nextInt();
		System.out.print("preco: ");
		double preco = scan.nextDouble();
		System.out.print("forma de pagamento: \n");
		System.out.print("1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito");
		int forma = scan.nextInt();
		
		double valorFinal=preco*quant;
		
		double desconto;
		
		if(forma==1)
		{
			desconto = valorFinal*(10/100.00);
			valorFinal -= desconto;
		}else if(forma == 2)
		{
			desconto = valorFinal*(2/100.00);
			valorFinal -= desconto;	
		}else if(forma == 3)
		{
			desconto = valorFinal*(5/100.00);
			valorFinal -= desconto;
		}else {
			desconto = valorFinal*(3/100.00);
			valorFinal -= desconto;
		}
		
		System.out.println("desconto: "+desconto);
		System.out.println("valor final: "+valorFinal);

	}

}
