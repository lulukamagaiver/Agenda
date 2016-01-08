package com.br.mvsistemas.agenda.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.br.mvsistemas.agenda.enums.TipoPessoaEnum;

@Entity
@Table(name = "cliente")
public class ClienteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3462380793203624415L;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "id_cliente")
	private long id;
	
	@Column(columnDefinition="NUMERIC (18,0)",nullable=true)
	private String cpf_cnpj;
	
	@Column(length=50, nullable=true)
	private String ie_rg;
	
	@Enumerated(EnumType.STRING)
	private TipoPessoaEnum tipo;
	
	@ManyToOne @JoinColumn(name="id_pessoa") @ForeignKey(name="FK_CLIENTE_PESSOA")
	private PessoaBean pessoa;
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
	 * @return the cpf_cnpj
	 */
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	/**
	 * @param cpf_cnpj the cpf_cnpj to set
	 */
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	/**
	 * @return the ie_rg
	 */
	public String getIe_rg() {
		return ie_rg;
	}
	/**
	 * @param ie_rg the ie_rg to set
	 */
	public void setIe_rg(String ie_rg) {
		this.ie_rg = ie_rg;
	}
	
	/**
	 * @return the tipo
	 */
	public TipoPessoaEnum getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoPessoaEnum tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the pessoa
	 */
	public PessoaBean getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(PessoaBean pessoa) {
		this.pessoa = pessoa;
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
		ClienteBean other = (ClienteBean) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
