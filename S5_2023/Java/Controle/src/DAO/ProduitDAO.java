package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import business.Produit;

public class ProduitDAO {

	Statement stmt;
	MysqlConnection connection;

	public ProduitDAO(MysqlConnection connection) {
		super();

		this.connection = connection;
		stmt = connection.getStmt();

		// TODO Auto-generated constructor stub
	}
	public void addProduit(Produit produit) {
		try {
			stmt.executeUpdate("INSERT INTO `Produit`(`id`, `designation`, `quantite`, `prix_ht`) VALUES ('"+ produit.getId() + "','" + produit.toString() + "','" + produit.getPrixHt() + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateProduit(Produit produit) {

		try {

			stmt.executeUpdate("UPDATE `Produit` SET `id`='"
			+ produit.getId() + "','" + produit.toString() + "','" + produit.getPrix_ht() );

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteProduit(Produit produit) {

		try {

			stmt.executeUpdate("DELETE FROM `Produit`  WHERE ID= '" + produit.getId() + "'");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public Produit findProduit(int id) {

		Produit produit = null;

		try {
			ResultSet resultat = stmt.executeQuery("SELECT * FROM `produit` WHERE  ID='" + id + "' ");
			while (resultat.next()) {

				produit = new Produit(resultat.getInt("ID"), resultat.getString("designation"),resultat.getString("quantite"),resultat.getString("prixHt"));

				// System.out.println(produit);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return produit;

	}

}
