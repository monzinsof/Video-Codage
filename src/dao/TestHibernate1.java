package dao;



import model.Contenu;
import model.Document;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestHibernate1 {
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config =new Configuration();
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
try{
			
			
	Document d = new Document();
			
	
			session.save(d);
		
		
			
} catch (Exception e) {
    
    throw e;
  } finally { 
    session.close(); 
  } 
 
} 
}
