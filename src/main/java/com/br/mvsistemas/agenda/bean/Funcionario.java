package com.br.mvsistemas.agenda.bean;

import java.io.Serializable;

public class Funcionario implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = -7237764642914478047L;
	
	private long id;
	private String funcao;
	private Pessoa pessoa;

	/**
	 * @return the funcao
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao the funcao to set
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
}
