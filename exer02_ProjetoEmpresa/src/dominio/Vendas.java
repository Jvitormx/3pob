package dominio;

public class Vendas extends Gerente{
	
	private float participacaoLucros;
	
	public Vendas(String matricula, String cpf, String nome, float salario, float gratificacao, float participacaoLucros)
	{
		super(matricula, cpf, nome, salario, gratificacao);
		this.participacaoLucros = participacaoLucros;
	}
	
	public float setParticipacaoLucros(float participacaoLucros)
	{
		return this.participacaoLucros = participacaoLucros;
	}
	
	@Override
	public void mostrarInfo()
	{
		super.mostrarInfo();
		System.out.println("participacao lucros:"+participacaoLucros);
	}
}
