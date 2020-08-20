package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Categoria;
import br.iesp.fullStack.entidades.EnumTipo;
import br.iesp.fullStack.entidades.OrdemServico;
import br.iesp.fullStack.interfaces.IOrdemServico;

public class OrdemServicoControler implements IOrdemServico {

	@Override
	public void salvar(OrdemServico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrdemServico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(OrdemServico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registraServico() {
		Categoria categoria = new Categoria();
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(categoria);
		OrdemServico os = new OrdemServico(1L, "Situação", "Troca da memória RAM", EnumTipo.INCIDENTE,  categorias);
		this.salvar(os);
	}

	@Override
	public OrdemServico buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
