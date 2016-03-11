package org.services.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory sessionfactory = buildsessionfactory();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildsessionfactory() {
		// TODO Auto-generated method stub
		try{
			
			return new Configuration().configure("config.cfg.xml").buildSessionFactory();
			
		
		}
		catch(Throwable ex){
			
			throw new ExceptionInInitializerError(ex);		
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	
	
	
}
