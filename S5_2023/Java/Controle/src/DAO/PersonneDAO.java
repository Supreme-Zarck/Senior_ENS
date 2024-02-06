package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import business.Personne;

public class PersonneDAO {
	
	Statement stmt;
	MysqlConnection connection ;

	public PersonneDAO( MysqlConnection connection) {
		super();
		
		this.connection = connection;
		stmt=connection.getStmt();
		
		// TODO Auto-generated constructor stub
	}
	
	public void addPersonne(Personne  personne) {
		
		try {
			stmt.executeUpdate("INSERT INTO `Persons`(`ID`, `LastName`, `FirstName`, `Age`) VALUES ('" + personne.getId() +"','" +personne.getNom()   +"','" + personne.getPrenom() +"','" +personne.getAge() +"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
		
	}
	
	public void updatePersonne(Personne  personne) {
		
		try {
			
			 stmt.executeUpdate("UPDATE `Persons` SET `FirstName`='" +personne.getPrenom()  +"',`LastName`= '" +personne.getNom()    +"',`Age`='" +personne.getAge() +"' WHERE ID= '" +personne.getId() +"'");
		      
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
		
	}
	
	
public void deletePersonne(Personne  personne) {
		
		try {
			
			 stmt.executeUpdate("DELETE FROM `Persons`  WHERE ID= '" +personne.getId() +"'");
		      
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
		
	}
	

public Personne findPersonne(int id) {
	
	
	Personne personne=null;
	
	
	try {
		ResultSet resultat = stmt.executeQuery("SELECT * FROM Persons WHERE  ID='" + id +"' ");
		while(resultat.next()) {
		  	

		  	  personne=new Personne(resultat.getInt("ID"), resultat.getString("LastName"), resultat.getString("FirstName"), +resultat.getInt("Age"));
		  	
		  	  
		   //   System.out.println(personne);
		   	 	 	 	
		    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    //étape 4: exécuter la requête
    
	
	
	
	return personne;
	
	
	
}

public char[] findProduit(int i) {
	// TODO Auto-generated method stub
	return null;
}
	

}
