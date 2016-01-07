package com.br.mvsistemas.agenda.bean;

import java.io.Serializable;
import java.util.Date;

import com.br.mvsistemas.agenda.enums.Sexo;

public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2954087443444174579L;
	
	private long id;
	private String nome;
	private String endereco;
	private String telefone;
	private String bairro;
	private String numero;
	private String cidade;
	private String uf;
	private String email;
	private Date nascimento;
	private Date DtCadastro;
	private Sexo sexo;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the nascimento
	 */
	public Date getNascimento() {
		return nascimento;
	}
	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	/**
	 * @return the dtCadastro
	 */
	public Date getDtCadastro() {
		return DtCadastro;
	}
	/**
	 * @param dtCadastro the dtCadastro to set
	 */
	public void setDtCadastro(Date dtCadastro) {
		DtCadastro = dtCadastro;
	}
	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
