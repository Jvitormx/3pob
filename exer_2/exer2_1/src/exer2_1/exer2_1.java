package exer2_1;

import java.util.Scanner;

public class exer2_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int age;
		
		System.out.print("idade: ");
		
		age = scan.nextInt();
		
		if(age<18)
		{
			System.out.print("menor que 18");
			}else {
			System.out.print("Maior que 18");
			}
		}

	}
