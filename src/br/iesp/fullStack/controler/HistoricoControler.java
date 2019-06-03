package br.iesp.fullStack.controler;

import java.util.ArrayList;
import java.util.List;

import br.iesp.fullStack.entidades.Historico;
import br.iesp.fullStack.interfaces.IGeneric;

public class HistoricoControler implements IGeneric {
	List<Historico> historicos = new ArrayList<>();

	@Override
	public <T> void salvar(T object) {
		System.out.println("Historico cadastrado ...");
		this.historicos.add((Historico)object);		
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

}
