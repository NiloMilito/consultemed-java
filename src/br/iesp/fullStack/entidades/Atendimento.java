package br.iesp.fullStack.entidades;

import java.util.List;

public class Atendimento {
	private Long id;
	private Cliente cliente;
	private int niveUrgencia;
	private Grupo grupo;
	private List<Equipamento> equipamentos;
	private Historico historico;
	private OrdemServico ordemServico;
	private String solicitacao;
	
		
	public void executarOrdemServico() {
		
	}

	public void guardarHistorico() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNiveUrgencia() {
		return niveUrgencia;
	}

	public void setNiveUrgencia(int niveUrgencia) {
		this.niveUrgencia = niveUrgencia;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}
	
}
