package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Cliente;
import br.iesp.fullStack.interfaces.ICliente;

public class ClienteControler implements ICliente {
	List<Cliente> clientes = new ArrayList<>();
	
	private AtendenteControler atendenteControler;

	@Override
	public <T> void salvar(T object) {
		this.clientes.add((Cliente)object);	
		System.out.println("Cliente Salvo...");
	}

	@Override
	public <T> List<T> listar() {			
		return null;
	}

	@Override
	public <T> void remover(T object) {		
		this.clientes.remove(object);
	}

	@Override
	public void realizaChamado(Cliente cliente) {
		System.out.println("Chamada realizada ...!");
		this.atendenteControler = new AtendenteControler();
		
		this.atendenteControler.registraChamada(cliente);
		
		
	}
	
	

}
