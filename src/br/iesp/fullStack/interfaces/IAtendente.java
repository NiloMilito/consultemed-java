package br.iesp.fullStack.interfaces;

import br.iesp.fullStack.entidades.Cliente;

public interface IAtendente extends IGeneric{
	public void abreOrdemServico();
	public void registraChamada(Cliente cliente);

}
