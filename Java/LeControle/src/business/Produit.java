
package business;

public class Produit {
	protected int id;
	protected String designation;
	protected int quantite;
	protected float prixHt;
	private Depot depot;

	public Produit(Depot dd, int id, String designation, int quantite, float prixHt) {
		super();
		depot = dd;
		dd.ajouter(this);
		this.id = id;
		this.designation = designation;
		this.quantite = quantite;
		this.prixHt = prixHt;
	}

	public Produit(int int1, String string, String string2, String string3) {
		
	}

	public Depot getDepot() {
		return depot;
	}

	public void setDepot(Depot depot) {
		depot.supprimer(this);
		;
		this.depot = depot;
		this.depot.ajouter(this);
	}

	public String toString() {
		return depot + "Produit [id=" + id + ", designation=" + designation +
				", quantite=" + quantite + ", prix_ht=" + prixHt;
	}

	public void afficher() {
		System.out.println(toString());
	}
	public float getPrix_ht() {
		return prixHt;
	}

	public void setPrix_ht(Float prix_ht) {
		this.prixHt = prix_ht;
		
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
}