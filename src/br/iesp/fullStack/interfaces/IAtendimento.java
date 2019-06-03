package br.iesp.fullStack.interfaces;

import br.iesp.fullStack.entidades.Historico;
import br.iesp.fullStack.entidades.Tecnico;

public interface IAtendimento extends IGeneric {
	public void executaOrdemServico(Tecnico tecnico);
	public void guardaHistorico(Historico historico);

}
