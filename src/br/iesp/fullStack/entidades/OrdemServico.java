package br.iesp.fullStack.entidades;

import java.util.List;

public class OrdemServico {
	private Long id;
	private String situacao;
	private String solucao;
	private EnumTipo tipo;
	private List<Categoria> categorias;
			
	public OrdemServico(Long id, String situacao, String solucao, EnumTipo tipo, List<Categoria> categorias) {
		this.id = id;
		this.situacao = situacao;
		this.solucao = solucao;
		this.tipo = tipo;
		this.categorias = categorias;
	}

	public void registrarConserto() {
		
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getSolucao() {
		return solucao;
	}


	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}


	public EnumTipo getTipo() {
		return tipo;
	}


	public void setTipo(EnumTipo tipo) {
		this.tipo = tipo;
	}
		 
}
