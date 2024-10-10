package dominio;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) {
		super(endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj()
	{
		return this.cnpj;
	}
	
	public String getRazaoSocial()
	{
		return this.razaoSocial;
	}
	
	@Override
	public void mostrarInfo()
	{
		super.mostrarInfo();
		System.out.println("cnpj:"+cnpj);
		System.out.println("razao social:"+razaoSocial);
	}
}
