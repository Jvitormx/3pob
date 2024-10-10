package dominio;

public abstract class Cliente {
	
	protected String endereco;
	protected String telefone;
	
	public Cliente(String endereco, String telefone)
	{
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getEndereco()
	{
		return this.endereco;
	}
	
	public String getTelefone()
	{
		return this.telefone;
	}

	public void mostrarInfo()
	{
		System.out.println("endereco:"+endereco);
		System.out.println("telefone:"+telefone);
	}
}
