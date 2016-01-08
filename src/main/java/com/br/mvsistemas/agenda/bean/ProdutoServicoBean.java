package com.br.mvsistemas.agenda.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoServicoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5691623838394546602L;
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "id_prod_serv")
	private long id;
	
	@Column(length=50, nullable=false)
	private String nomeProdServ;
	
	@Column(precision=10,scale=2)
	private BigDecimal valor;
	
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
	 * @return the nomeProdServ
	 */
	public String getNomeProdServ() {
		return nomeProdServ;
	}
	/**
	 * @param nomeProdServ the nomeProdServ to set
	 */
	public void setNomeProdServ(String nomeProdServ) {
		this.nomeProdServ = nomeProdServ;
	}
	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}
