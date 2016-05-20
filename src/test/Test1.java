package test;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modele.WebService;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Bienvenue dans l'espace d'ajout de WS "+  "\n" +  "\n" 
		+" 0 - Ajouter un Web Service" +  "\n" 
	    + " 1 - Afficher tous les Web Services répertoriés dans le registre " + "\n"
		+ " 2 - Afficher les détails d'un Web Service" +  "\n"
	    + "Choisissez un chiffre pour utiliser une fonctionnalité");
		Scanner sc = new Scanner(System.in);
	int choix = sc.nextInt();
		if (choix == 0){
			ajoutWS();
		}
		if (choix == 1){
			searchWS();
		}
		else {
			System.out.println("ce choix n'est pas disponible");	
			
		}
		
	}
	
	public static String ajoutWS(){
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
			
		// Ouverture session
				Session session = sessionFactory.openSession() ;
				session.close();
				session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				System.out.println("Ajouter un Web Service: Saissez le nom");
				WebService wbs1 = new WebService();
				Scanner sc = new Scanner(System.in);
				String nomWS = sc.nextLine();
				wbs1.setNomWS(nomWS);
				System.out.println("Ajouter un Web Service: Saissez le type");
				String typeWS = sc.nextLine();
				wbs1.setTypeWS(typeWS);
				System.out.println("Ajouter un Web Service: Saissez le commentaire");
				String commentaireWS = sc.nextLine();
				wbs1.setCommentaireWS(commentaireWS);
				sc.close();

				session.save(wbs1);
				System.out.println("Nouveau Web Service ajouté!");
				
				tx.commit();
				System.out.println("WS sauvegardé");
				session.close();
		return null;
	}
	
	public static void searchWS(){
		
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
			
		// Ouverture session
				Session session = sessionFactory.openSession() ;
				session.close();
				session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				Query query = session.createQuery("from WebService");
				List result = query.list();
				System.out.println(result);
	}

}
