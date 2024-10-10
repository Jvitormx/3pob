package dominio;

public abstract class Funcionario {
	
	protected String matricula;
	protected String cpf;
	protected String nome;
	protected float salario;
	
	public Funcionario(String matricula, String cpf, String nome, float salario)
	{
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String setMatricula(String matricula)
	{
		return this.matricula = matricula;
	}
	
	public String setCpf(String cpf)
	{
		return this.cpf = cpf;
	}
	
	public String setNome(String nome)
	{
		return this.nome = nome;
	}
	
	public float setCpf(float salario)
	{
		return this.salario = salario;
	}
	
	public void mostrarInfo()
	{
		System.out.println("matricula:"+matricula);
		System.out.println("cpf:"+cpf);
		System.out.println("nome:"+nome);
		System.out.println("salario:"+salario);
	}
}
