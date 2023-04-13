package fr.sdv.b32223;

import fr.sdv.b32223.entities.*;

import javax.persistence.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TestBibliotheque();

        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();

        Livre livre = em.find( Livre.class, 4);

        System.out.println("Livre ID 4 : ");
        System.out.println(livre);

        em.getTransaction().begin();
        Livre newLivre = new Livre( "Germinal", "Émile Zola");
        em.persist(newLivre);
        em.getTransaction().commit();
        System.out.println("Nouveau livre : ");
        System.out.println(newLivre);

        em.getTransaction().begin();
        Livre updateLivre = em.find( Livre.class, 5);
        updateLivre.setTitre("Du plaisir dans la cuisine");
        em.merge(updateLivre);
        em.getTransaction().commit();
        System.out.println("Le livre modifier : ");
        System.out.println(updateLivre);

        Query query = em.createQuery("SELECT l FROM Livre l WHERE l.titre = :titre");
        query.setParameter("titre", "Germinal");
        Livre germinaleBook = (Livre) query.getResultList().get(0);
        System.out.println("Le livre Germinal : ");
        System.out.println(germinaleBook);

        em.getTransaction().begin();
        Livre livreDelete = em.find(Livre.class, 5);
        em.remove(livreDelete);
        em.getTransaction().commit();

        TypedQuery<Livre> toutLesLivres = em.createQuery("SELECT l FROM Livre l", Livre.class);
        List<Livre> livres = toutLesLivres.getResultList();

        System.out.println("Liste de tous les livres :");
        for (Livre livreList : livres) {
            System.out.println(livre.getTitre() + " par " + livreList.getAuteur());
        }

        em.close();
        emf.close();*/
    }

    public static void TestBibliotheque(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();

        Emprunt emprunt = em.find( Emprunt.class, 1);
        System.out.println(emprunt.getLivres());

        Client client = em.find( Client.class, 1);
        System.out.println(client.getEmprunts());

        em.close();
        emf.close();
    }
}