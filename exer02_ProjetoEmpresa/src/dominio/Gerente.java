package dominio;

public class Gerente extends Funcionario {
	
	private float gratificacao;
	
	public Gerente(String matricula, String cpf, String nome, float salario, float gratificacao)
	{
		super(matricula, cpf, nome, salario);
		this.gratificacao = gratificacao;
	}
	
	public float setGratificacao(float gratificacao)
	{
		return this.gratificacao = gratificacao;
	}
	
	@Override
	public void mostrarInfo()
	{
		super.mostrarInfo();
		System.out.println("gratificacao:"+gratificacao);
	}
}
