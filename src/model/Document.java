package model;

import org.hibernate.Session;

import dao.HibernateUtil;

public class Document {
	private int id_document;
	private String nom_document;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_document() {
		return id_document;
	}
	public void setId_document(int id_document) {
		this.id_document = id_document;
	}
	


	public String getNom_document() {
		return nom_document;
	}
	public void setNom_document(String nom_document) {
		this.nom_document = nom_document;
	}
	private String description;
	public void save(){	
		Session session = HibernateUtil.getSessionFactory().openSession();

		Document d = new Document();
		d.setNom_document(this.getNom_document());
	    session.save(d);
		
			
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	

}
