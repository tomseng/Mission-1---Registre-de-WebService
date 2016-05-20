package test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import modele.WebService;

public class Test1 {

	public static void main(String[] args) throws Exception {
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
		
		
		
		
	}

}
