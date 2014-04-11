package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import dao.HibernateUtil;

@ManagedBean
@SessionScoped
public class Contenu implements Serializable  {
	private int id_contenu; 
	private int id_zone ;
	private int id_document ;
	private int id_type_page;
	private String cont ;
	private char path_img ;
	public int getId_contenu() {
		return id_contenu;
	}
	public void setId_contenu(int id_contenu) {
		this.id_contenu = id_contenu;
	}
	public int getId_zone() {
		return id_zone;
	}
	public void setId_zone(int id_zone) {
		this.id_zone = id_zone;
	}
	public int getId_document() {
		return id_document;
	}
	public void setId_document(int id_document) {
		this.id_document = id_document;
	}
	public int getId_type_page() {
		return id_type_page;
	}
	public void setId_type_page(int id_type_page) {
		this.id_type_page = id_type_page;
	}

	public char getPath_img() {
		return path_img;
	}
	public void setPath_img(char path_img) {
		this.path_img = path_img;
	}
	public Contenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void save(){	
		Session session = HibernateUtil.getSessionFactory().openSession();

		Contenu c = new Contenu();
	    c.setCont(this.getCont());
	    session.save(c);
		
			
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}

}
