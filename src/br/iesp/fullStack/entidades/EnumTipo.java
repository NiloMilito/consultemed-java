package br.iesp.fullStack.entidades;

public enum EnumTipo {
	INCIDENTE(2), PROBLEMA(3), SOLICITACAO(4);
	
	 private int valor;
	 private String solicitacao;
	 
	 EnumTipo(int valorOpcao){
	     valor = valorOpcao;
	 }
	 
	 public int getValor(){
	     return valor;
	 }

	public String getSolicitacao() {
		return solicitacao;
	}

}
