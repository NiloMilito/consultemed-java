package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Cliente;
import br.iesp.fullStack.interfaces.ICliente;

public class ClienteControler implements ICliente {
	List<Cliente> clientes = new ArrayList<>();
	
	private AtendenteControler atendenteControler;

	@Override
	public void salvar(Cliente object) {
		this.clientes.add(object);	
		System.out.println("Cliente Salvo...");
	}

	@Override
	public List<Cliente> listar() {			
		return null;
	}

	@Override
	public void remover(Cliente object) {		
		this.clientes.remove(object);
	}

	@Override
	public void realizaChamado(Cliente cliente) {
		System.out.println("Chamada realizada ...!");
		this.atendenteControler = new AtendenteControler();		
		this.atendenteControler.registraChamada(cliente);				
	}

	@Override
	public Cliente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
