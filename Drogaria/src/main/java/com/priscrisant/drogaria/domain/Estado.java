/**
 * 
 * @author Priscilla Ribeiro
 * @version 1.0
 * @since 2016-11-05
 */
package com.priscrisant.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity  
public class Estado extends GenericDomain{
	
	@Column(length = 2, nullable = false)
	private String sigla;
	
	@Column(length = 50 , nullable = false)
	private String nome;
	
	//Métodos de acesso
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
