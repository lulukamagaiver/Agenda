package com.br.mvsistemas.agenda.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Null;

import com.br.mvsistemas.agenda.enums.SexoEnum;

@Entity
public class PessoaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2954087443444174579L;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "id_pessoa")
	private long id;
	
	@Column(nullable=false, length=60)
	private String nome;
	
	@Column(nullable=true, length=60)
	private String endereco;
	
	@Column(nullable=true, length=11)
	private String telefone;
	
	@Column(nullable=true, length=60)
	private String bairro;
	
	@Column(nullable=true)
	private String numero;
	
	@Column(nullable=true)
	private String cidade;
	
	@Column(nullable=true, length=2)
	private String uf;
	
	@Column(nullable=true, length=60)
	private String email;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Calendar nascimento;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Calendar DtCadastro;
	
	@Enumerated(EnumType.STRING)
	private SexoEnum sexo;
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
	public Calendar getNascimento() {
		return nascimento;
	}
	/**
	 * @param nascimento the nascimento to set
	 */
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	/**
	 * @return the dtCadastro
	 */
	public Calendar getDtCadastro() {
		return DtCadastro;
	}
	/**
	 * @param dtCadastro the dtCadastro to set
	 */
	public void setDtCadastro(Calendar dtCadastro) {
		DtCadastro = dtCadastro;
	}
	/**
	 * @return the sexo
	 */
	public SexoEnum getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(SexoEnum sexo) {
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
		PessoaBean other = (PessoaBean) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
