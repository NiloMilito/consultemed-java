package br.iesp.fullStack.entidades;

public class Endereco {
	private Long id;
	private String logradouro;
	private int numero;
	private String bairro;
	private String municipio;
	private String estado;
	
	public Endereco(Long id, String logradouro, int numero, String bairro, String municipio, String estado) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
