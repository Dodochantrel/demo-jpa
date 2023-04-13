package fr.sdv.b32223.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name="emprunt")
public class Emprunt {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DATE_DEBUT")
    private LocalDate dateDebut;

    @Column
    private int delai;

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name="compo",
            joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName= "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")
    )


    private Set<Livre> livres;

    {
        livres = new HashSet<>();
    }

    public Emprunt() {
    }

    public Emprunt(LocalDate dateDebut, int delai, LocalDate dateFin, Client client) {
        this.dateDebut = dateDebut;
        this.delai = delai;
        this.dateFin = dateFin;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", delai=" + delai +
                ", dateFin=" + dateFin +
                ", client=" + client +
                '}';
    }
}
