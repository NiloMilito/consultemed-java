package br.iesp.fullStack.teste;

import br.iesp.fullStack.controler.ClienteControler;
import br.iesp.fullStack.entidades.Cliente;
import br.iesp.fullStack.entidades.Endereco;

public class App {
	public static void main(String[] args) {
		// Long id, String nome, String cpf, Endereco endereco, String email
		Cliente cliente1 = new Cliente(1L,
		 " "," ", new Endereco(1L, "Av Rosa Farias", 122,"Bancarios", "João Pessoa", "PB")," ");
	
		ClienteControler clienteControler = new ClienteControler();
		// Salva cliente
		clienteControler.salvar(cliente1);
		
		// Realiza Chamada
		clienteControler.realizaChamado(cliente1);
		
	}

}
