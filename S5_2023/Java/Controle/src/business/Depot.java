//class-Depot
package business;

public class Depot {
    private int id;
    private String adresse;
    private float superficier;
    public int cntr;
    public Produit tab[] = new Produit[255];

    public Depot() {
    }

    public Depot(int id, String adresse, float superficier) {
        super();
        this.id = id;
        this.adresse = adresse;
        this.superficier = superficier;
    }

    public int getCntr() {
        return cntr;
    }

    public void setCntr(int cntr) {
        this.cntr = cntr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void ajouter(Produit produit) {
        tab[cntr] = produit;
        cntr++;
    }

    public String toString() {
        return "Depot [id=" + id + ", adresse=" + adresse + ", superficier="
                + superficier + ": ";
    }

    public void affichertab() {
        for (int i = 0; i < cntr; i++) {
            tab[i].afficher();
        }
    }

    private int getIndexTab(Produit produit) {
        for (int i = 0; i < cntr; i++) {
            if (produit.id == tab[i].id) {
                return i;
            }
        }
        return 256;
    }

    public void supprimer(Produit produit) {
        int x = getIndexTab(produit);
        if (x != 256) {
            for (int i = x; i < cntr; i++) {
                tab[i] = tab[i + 1];
            }
        }
        cntr--;
    }

    // methode1
    public void modifier(int i, int id, String designation, int quantite,float prixHt) {
        tab[i].id = id;
        tab[i].designation = designation;
        tab[i].quantite = quantite;
        tab[i].prixHt = prixHt;
    }

    // methode2
    public void modifier(int i, Produit produit) {
        tab[i] = produit;
    }
}