package presentation;

import DAO.MysqlConnection;
import DAO.PersonneDAO;
import DAO.ProduitDAO;
import business.Produit;

public class MaclassePrincipale {
	

	public static void main(String[] args) {
		
		MysqlConnection connection =new MysqlConnection();
		
		PersonneDAO pdao=new PersonneDAO(connection);
		
		ProduitDAO prdao = new ProduitDAO(connection);
		
		
		
		
		Produit produit =new Produit("yudh", 123, "dfgh", 37, 389);
		
		//pdao.updatePersonne(personne);
		
		pdao.deletePersonne(produit);
		
		System.out.println(pdao.findProduit(11));
		
	
	}

}
