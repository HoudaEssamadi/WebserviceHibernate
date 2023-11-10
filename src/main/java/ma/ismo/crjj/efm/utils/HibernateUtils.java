package ma.ismo.crjj.efm.utils;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import ma.ismo.crjj.efm.model.Etablissement;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Etablissement.class);
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}