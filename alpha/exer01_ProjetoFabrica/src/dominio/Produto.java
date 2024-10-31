package dominio;

import java.util.ArrayList;

public abstract class Produto {
	
	private int id;
	private String nome;
	private double valor;

	ArrayList<Produto> produtoLista = new ArrayList<Produto>();
	
	public Produto(int id, String nome, double valor)
	{
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public void listarProduto(Produto prod)
	{
		produtoLista.add(prod);
	}

	public void mostrarInfo()
	{
		System.out.println("id:"+id);
		System.out.println("nome:"+nome);
		System.out.println("valor:"+tevalorlefone);
	}
}
