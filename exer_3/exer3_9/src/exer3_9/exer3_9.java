package exer3_9;

public class exer3_9 {

	public static void main(String[] args) {
		 System.out.println("Tabela de Conversão de Fahrenheit para Celsius");
	        System.out.println("Fahrenheit\tCelsius");

	        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
	          
	            double celsius = 5.0 / 9.0 * (fahrenheit - 32);

	            
	            System.out.printf("%d\t\t%.2f\n", fahrenheit, celsius);
	}

}
}