package br.iesp.fullStack.entidades;

public class Tecnico extends Pessoa{
	public Tecnico(Long id, String nome, String cpf, Endereco endereco, String especialidade, Grupo grupo) {
		super(id, nome, cpf, endereco);
		this.especialidade = especialidade;
		this.grupo = grupo;
	}

	private String especialidade;
	private Grupo grupo;
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public void executaAtendimento() {
		
	}
	
	public void atendeOrdemServico() {
		
	}
	
}
