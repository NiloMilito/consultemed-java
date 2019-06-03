package br.iesp.fullStack.entidades;

import java.util.List;

public class SubCategoria {
	private Long id;
	private String nome;	
	private List<ItemCategoria> itens;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<ItemCategoria> getItens() {
		return itens;
	}
	public void setItens(List<ItemCategoria> itens) {
		this.itens = itens;
	}
	

}
