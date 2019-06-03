package br.iesp.fullStack.interfaces;

import br.iesp.fullStack.entidades.Cliente;

public interface ICliente extends IGeneric {
	public void realizaChamado(Cliente cliente);
}
