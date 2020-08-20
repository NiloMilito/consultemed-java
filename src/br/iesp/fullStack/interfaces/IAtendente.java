package br.iesp.fullStack.interfaces;

import br.iesp.fullStack.entidades.Atendente;
import br.iesp.fullStack.entidades.Cliente;

public interface IAtendente extends IGeneric<Atendente> {
	public void abreOrdemServico();
	public void registraChamada(Cliente cliente);

}
