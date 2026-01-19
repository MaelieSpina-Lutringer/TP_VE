package fr.btsciel;

public class Voiture {

    private int id;
    private String marque;
    private String modele;
    private int vente;

    public Voiture(int id, String marque, String modele, int vente) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.vente = vente;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getVentes() {
        return vente;
    }
}
