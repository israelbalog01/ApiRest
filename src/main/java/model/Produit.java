package model;

public class Produit {
    private int id;
    private String nomProduit;
    private int prix;

    // Assume many-to-one relationship with Commande
    private Commande commande;

    public Produit() {
    }

    public Produit(int id, String nomProduit, int prix, Commande commande) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.prix = prix;
        this.commande = commande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
