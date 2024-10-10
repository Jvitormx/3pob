package dominio;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private String nome;
	
	public PessoaFisica(String endereco, String telefone, String cpf, String nome) {
		super(endereco, telefone);
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf()
	{
		return this.cpf;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	@Override
	public void mostrarInfo()
	{
		super.mostrarInfo();
		System.out.println("cpf:"+cpf);
		System.out.println("nome:"+nome);
	}

}
