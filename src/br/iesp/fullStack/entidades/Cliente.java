package br.iesp.fullStack.entidades;

public class Cliente  extends Pessoa{	
	private String email;
	
	public Cliente(Long id, String nome, String cpf, Endereco endereco, String email) {
		super(id, nome, cpf, endereco);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
