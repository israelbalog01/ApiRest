package model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "clients")
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String datenaissance;
    @Column(nullable = false)
    private String email;


    public Client() {
    }

    public Client(int id, String nom, String prenom, String datenaissance, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.email = email;
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

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
