package br.iesp.fullStack.interfaces;

import br.iesp.fullStack.entidades.Tecnico;

public interface ITecnico extends IGeneric{
	public void executaAtendimento();
	public void atendeOrdemServico(Tecnico tecnico);

}
