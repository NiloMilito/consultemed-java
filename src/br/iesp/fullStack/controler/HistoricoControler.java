package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Historico;
import br.iesp.fullStack.interfaces.IGeneric;

public class HistoricoControler implements IGeneric<Historico> {
	List<Historico> historicos = new ArrayList<>();

	@Override
	public void salvar(Historico object) {
		System.out.println("Historico cadastrado ...");
		this.historicos.add((Historico)object);		
	}

	@Override
	public List<Historico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Historico object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Historico buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
