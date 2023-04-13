package fr.sdv.b32223.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @Column
    private String prenom;
    @OneToMany
    private Set<Emprunt> emprunts;

    {
        emprunts = new HashSet<>();
    }

    public Client() {
    }

    public Client(String nom, String prenom, Set<Emprunt> emprunts) {
        this.nom = nom;
        this.prenom = prenom;
        this.emprunts = emprunts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts() {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emprunts=" + emprunts +
                '}';
    }
}
