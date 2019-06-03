package br.iesp.fullStack.entidades;

import java.util.List;

public class Categoria {
	private Long id;
	private String tipo;
	private String nome;
	private List<SubCategoria> subcategorias;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<SubCategoria> getSubcategorias() {
		return subcategorias;
	}
	public void setSubcategorias(List<SubCategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
	

}
