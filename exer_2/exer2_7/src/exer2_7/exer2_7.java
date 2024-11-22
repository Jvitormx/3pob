package exer2_7;
import java.util.Scanner;


public class exer2_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("num1: ");
		int num1 = scan.nextInt();
		
		System.out.print("num2: ");
		int num2 = scan.nextInt();
		
		System.out.print("num3: ");
		int num3 = scan.nextInt();
		
		if(num1>num2)
		{
			if(num2>num3)
			{
				System.out.print("num1 é maior");
			}else if(num1>num3)
			{
				System.out.print("num1 é maior");
			}else {
				System.out.print("num3 é maior");
			}
		}else if(num1>num3)
		{
			System.out.print("num2 é maior");
		}else if(num2>num3)
		{
			System.out.print("num2 é maior");
		}else {
			System.out.print("num3 é maior");
		}
	}
}
