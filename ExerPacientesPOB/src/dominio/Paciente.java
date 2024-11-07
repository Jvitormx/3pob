package dominio;

public class Paciente {
	private int numero;
	private double peso;
	private double altura;
	
	public Paciente(int numero, double peso, double altura)
	{
		this.setNumero(numero);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void listarPaciente()
	{
		System.out.println("numero: "+numero+" peso: "+peso+" altura: "+altura);
	}
}
