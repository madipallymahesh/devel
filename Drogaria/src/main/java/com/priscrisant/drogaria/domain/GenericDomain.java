package com.priscrisant.drogaria.domain;
/**
 * 
 * @author Priscilla Ribeiro
 * @version 1.0
 * @since 2016-11-05
 */
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * Classe não corresponde a uma tabela, mas será usada
 * por outras para gerar uma tabela
 * */
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable{
	
	//Chave primária que será gerada de forma automática pelo banco
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long codigo;
	
	//Métodos de acesso
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
