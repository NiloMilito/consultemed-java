package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.iesp.fullStack.entidades.Atendente;
import br.iesp.fullStack.entidades.Atendimento;
import br.iesp.fullStack.entidades.Categoria;
import br.iesp.fullStack.entidades.Cliente;
import br.iesp.fullStack.entidades.EnumTipo;
import br.iesp.fullStack.entidades.Equipamento;
import br.iesp.fullStack.entidades.Grupo;
import br.iesp.fullStack.entidades.Historico;
import br.iesp.fullStack.entidades.OrdemServico;
import br.iesp.fullStack.entidades.Tecnico;
import br.iesp.fullStack.interfaces.IAtendente;

public class AtendenteControler implements IAtendente {
	
	private HistoricoControler historicoControler;
	private AtendimentoControler atendimentoControler;

	@Override
	public void salvar(Atendente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Atendente> listar() {
		return null;
	}

	@Override
	public void remover(Atendente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abreOrdemServico() {		
	}

	@Override
	public void registraChamada(Cliente cliente) {
		this.atendimentoControler = new AtendimentoControler();
		Atendimento atendimento = new Atendimento();
		atendimento.setCliente(cliente);
		atendimento.setId(1L);
		Grupo grupo = new Grupo(1L, "Tecnicos");
		atendimento.setGrupo(grupo);
	
		Tecnico tecnico = new Tecnico(1L, "jOAQUIM", "034034030", null, "tecnico", grupo);
		
		atendimentoControler.executaOrdemServico(tecnico);

		this.historicoControler = new HistoricoControler();
		Historico historico = new Historico(1L, "Integração", new Date(), tecnico);
		this.historicoControler.salvar(historico);
		
		atendimento.setHistorico(historico);
		atendimento.setNiveUrgencia(2);

		Categoria categoria = new Categoria();
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(categoria);
		OrdemServico os = new OrdemServico(1L, "Situação", "Troca da memória RAM", EnumTipo.INCIDENTE,  categorias);
		
		atendimento.setOrdemServico(os);
		List<Equipamento> lst = new ArrayList<>();
		lst.add(new Equipamento(1L, "Notebook"));
		atendimento.setEquipamentos(lst);
		
		
		this.atendimentoControler.salvar(atendimento);
		
	}

	@Override
	public Atendente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
