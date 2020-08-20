package br.iesp.fullStack.controler;

import java.util.List;

import br.iesp.fullStack.entidades.Tecnico;
import br.iesp.fullStack.interfaces.ITecnico;

public class TecnicoControler implements ITecnico{
	private OrdemServicoControler ordemServicoControler;

	@Override
	public void salvar(Tecnico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tecnico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Tecnico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executaAtendimento() {
		this.ordemServicoControler = new OrdemServicoControler();
		this.ordemServicoControler.registraServico();		
	}

	@Override
	public void atendeOrdemServico(Tecnico tecnico) {
		this.executaAtendimento();		
	}

	@Override
	public Tecnico buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
