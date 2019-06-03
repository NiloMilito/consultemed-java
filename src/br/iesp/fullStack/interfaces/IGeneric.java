package br.iesp.fullStack.interfaces;

import java.util.List;

public interface IGeneric {
	
	public <T> void salvar(T object);
	public <T> List<T> listar();
	public <T> void remover(T object);

}
