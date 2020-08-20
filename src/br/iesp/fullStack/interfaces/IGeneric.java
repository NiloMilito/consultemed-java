package br.iesp.fullStack.interfaces;

import java.util.List;

public interface IGeneric<T> {
	
	public void salvar(T object);
	public List<T> listar();
	public T buscar(Long id);
	public void remover(T object);

}
