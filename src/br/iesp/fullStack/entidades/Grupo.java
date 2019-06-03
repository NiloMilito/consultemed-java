package br.iesp.fullStack.entidades;

public class Grupo {
	private Long id;
	private String Nome;
		
	public Grupo(Long id, String nome) {
		this.id = id;
		Nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
}
