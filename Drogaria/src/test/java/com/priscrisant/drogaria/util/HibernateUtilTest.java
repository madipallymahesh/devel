/**
 * 
 * @author Priscilla Ribeiro
 * @version 1.0
 * @since 2016-11-05
 */

package com.priscrisant.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	
	/*
	 * Teste de conexão com o banco de dados
	 */
	
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
	
}
