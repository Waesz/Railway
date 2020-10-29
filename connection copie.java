
	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class connection {



	
	  // public void connection1() {
		 
		   public static void main(String []args) {
		   
		  
		  Inscrit.Inscription();
		   
	      String JdbcURL = "jdbc:mysql://localhost:8889/projetFero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	      String Username = "root";
	      String password = "root";
	      
	      try {
	        Connection con = DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connected to MySQL database");
	         
	        
	         Statement myStmt = con.createStatement();
	         
	         
	         
	         ResultSet myRs = myStmt.executeQuery("SELECT prénom FROM Personne WHERE nom='Leroy'");
	         while (myRs.next()) {
	        	 ResultSet aaa= myRs;
	        	 if(aaa==null) {
	        	System.out.println("cest vide"); 
	        	 }
	        	 System.out.println("prénom: "+myRs.getString("prénom"));
	        	 
	        	 
	         }
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         ResultSet myRs2 = myStmt.executeQuery("Select SUM(nb_place) FROM wagon JOIN train WHERE train.id_train=wagon.id_train AND train.id_train=1");
	         while (myRs2.next()) {
	        	
	        	
	        	 System.out.println(myRs2.getInt("SUM(nb_place)"));
	        	 
	        	 
	         }
	         Statement INSCRIPTION = con.createStatement();
	         INSCRIPTION.executeUpdate("INSERT INTO PERSONNE (nom,prénom,mdp,email,typeAbo)"
	                                   +" VALUES ('AMIK', 'take','aaa','niro@orange.fr', 3)");
	         System.out.println("utilisateur créer");
	       
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      	
	   
	   }
	  
	   
	}
