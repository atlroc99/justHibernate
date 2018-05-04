package org.gsu.justHibernate.connection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Connection {
	
	private static SessionFactory sessionFactory;
	
	private static void setUp () throws Exception
	{
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
														.configure("hibernate.cfg.xml")
														.build();
		
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
		}catch(Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	
	public static SessionFactory getSessionFactory() throws Exception {
		setUp();
		return sessionFactory;
	}
}
