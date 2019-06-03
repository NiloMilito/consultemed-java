package br.iesp.fullStack.entidades;

import java.util.Date;

public class Historico {
	private Long id;
	private String interacao;
	private Date date;
	private Tecnico tecnico;
	
	
	public Historico(Long id, String interacao, Date date, Tecnico tecnico) {
		this.id = id;
		this.interacao = interacao;
		this.date = date;
		this.tecnico = tecnico;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInteracao() {
		return interacao;
	}
	public void setInteracao(String interacao) {
		this.interacao = interacao;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	

}
