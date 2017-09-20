package br.com.bc.tasklist.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory factory = createFactory();
	public static SessionFactory getFactory() {
		return factory;
	}
	private static SessionFactory createFactory() {
		try {
//			Configuration conf = new Configuration().configure();
//			ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
//			SessionFactory fab = conf.buildSessionFactory(reg);
			SessionFactory fab = new Configuration().configure().buildSessionFactory();
			return fab;
		} catch (Throwable ex) {
			System.err.println("Não iniciou a factory session"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
}
