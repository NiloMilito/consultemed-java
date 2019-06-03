package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Atendimento;
import br.iesp.fullStack.entidades.Historico;
import br.iesp.fullStack.entidades.Tecnico;
import br.iesp.fullStack.interfaces.IAtendimento;

public class AtendimentoControler implements IAtendimento{
	private List<Atendimento> atendimentos;
	private TecnicoControler tecnicoControler;
	
	
	public AtendimentoControler() {
		this.atendimentos = new ArrayList<>();
	}

	@Override
	public <T> void salvar(T object) {
		this.atendimentos.add((Atendimento) object);		
	}

	@Override
	public <T> List<T> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void remover(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executaOrdemServico(Tecnico tecnico) {
		this.tecnicoControler = new TecnicoControler();
		System.out.println("Ordem Serviço atendida! ...");
		
		
		this.tecnicoControler.atendeOrdemServico(tecnico);		
		
	}

	@Override
	public void guardaHistorico(Historico historico) {
		// TODO Auto-generated method stub
		
	}



}
