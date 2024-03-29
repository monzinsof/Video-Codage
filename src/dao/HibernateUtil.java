package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;



public class HibernateUtil {
	public static final SessionFactory sessionFactory;

    static {
        try {
          
            sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }



    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}