package DAO;

import java.sql.*;


import business.Depot;
public class DepotDAO {

	Statement stmt;
	MysqlConnection connection ;
	public DepotDAO( MysqlConnection connection) {
		super();

		this.connection = connection;
		stmt=connection.getStmt();

	}

	public void updateDépot(Depot  depot) {

		try {

			stmt.executeUpdate("UPDATE `Depot` SET `id`='" +depot.getId()  +"',`adresse`= '" +depot.getAdresse()    +"',`superficier`='" +depot.getCntr() +"' WHERE ID= '" +depot.getId() +"'");




		} catch (SQLException e) {

			e.printStackTrace();
		}


	}


	public void deletedépot(Depot  depot) {

		try {

			stmt.executeUpdate("DELETE FROM `Persons`  WHERE ID= '" +depot.getId() +"'");





		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	public Depot findépot(int id) {


		Depot  depot=null;


		try {
			ResultSet resultat = stmt.executeQuery("SELECT * FROM Persons WHERE  ID='" + id +"' ");
			while(resultat.next()) {


				depot=new Depot(resultat.getInt("id"), resultat.getString("adresse"), resultat.getFloat("superficier"));


				//   System.out.println(depot);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//étape 4: exécuter la requête




		return depot;



	}


}

}