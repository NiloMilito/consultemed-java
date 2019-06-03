package br.iesp.fullStack.entidades;

public class Atendente extends Pessoa{
	private String telefone;
	private Grupo grupo;
	
	public Atendente(Long id, String nome, String cpf, Endereco endereco, String telefone, Grupo grupo) {
		super(id, nome, cpf, endereco);
		this.telefone = telefone;
		this.grupo = grupo;
	}
	
	public void abreOrdemServico() {
		
	}
	
	public void registraChamada() {
		
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
