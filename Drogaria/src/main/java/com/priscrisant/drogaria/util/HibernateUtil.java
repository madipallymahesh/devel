package com.priscrisant.drogaria.util;
/**
 * 
 * @author Priscilla Ribeiro
 * @version 1.0
 * @since 2016-11-05
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	//variável global
	//fabricaDeSessoes recebe o resultado do método criarFabricaDeSessoes()
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();
	
	//método de acesso que lê hibernate.cfg.xml
	public static SessionFactory getFabricaDeSessoes(){
		return fabricaDeSessoes;
	}
	
	//Criando a fábrica de sessões
	private static SessionFactory criarFabricaDeSessoes(){
		try{
			Configuration configuracao = new Configuration().configure();
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			
			//Variável Local
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica;
		}catch(Throwable ex){
			System.err.println("A Fábrica de Sessões não pode ser "
					+ "criada");
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	
	

}
