package ConnectionBdFero;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 * @author lry41
 * @version 1.0
 * @return conn qui contient le driver +URL+UserName+Password
 */

public class ConnectionBdFero {
	
	private static final  String JdbcURL = "jdbc:mysql://localhost:3306/railway 2";
	private static final  String Username = "root";
	private static final  String password = "root";
    
	
	
	
	
	public static Connection connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //emplacement du driver jdbc

			    Connection conn=DriverManager.getConnection(JdbcURL, Username, password);
			    return conn;
			}
		catch(ClassNotFoundException | SQLException e){
			
			Logger.getLogger(ConnectionBdFero.class.getName()).log(Level.SEVERE,null,e);
			e.printStackTrace();
			
		}
		
		
		return null;
		
	}
	
}
