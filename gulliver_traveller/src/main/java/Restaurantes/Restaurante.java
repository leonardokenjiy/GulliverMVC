package Restaurantes;

public class Restaurante {

	private int id;
	private String nome;
	private String descricao;
	private String categoria;
	
	public Restaurante(int id, String nome, String descricao, String categoria) {
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

