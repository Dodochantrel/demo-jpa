package fr.sdv.banque.entities;

import fr.sdv.b32223.entities.Emprunt;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "Compte")
public class Compte {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column
    private String compte;

    @Column
    private double solde;

    @OneToMany(mappedBy="compte")
    private Set<Operation> operations;

    {
        operations = new HashSet<>();
    }

    @ManyToMany(mappedBy = "comptes")
    private Set<Client> client;

    {
        client = new HashSet<>();
    }

    public Compte() {
    }

    public Compte(String compte, double solde, Set<Operation> operations) {
        this.compte = compte;
        this.solde = solde;
        this.operations = operations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", compte='" + compte + '\'' +
                ", solde=" + solde +
                ", operations=" + operations +
                '}';
    }
}
