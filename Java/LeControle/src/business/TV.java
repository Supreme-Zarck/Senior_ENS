
package business;

public class TV extends Produit {
    private boolean type;
    private int taille;

    public TV(Depot d, int id, String designation, boolean type, int taille,
            int quantite, float prixHt) {
        super(d, id, designation, quantite, prixHt);
        this.type = type;
        this.taille = taille;
    }

public String toString() {
return super.toString()+" ,type=" + (type?"lcd":"autre") + ",taille=" + taille+ "]";
}
}
