package ConnectionBdFero;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 * conn qui contient le driver +URL+UserName+Password
 * @author lry41=Geoffrey
 * @version 1.0
 *
 */

public class ConnectionBdFero {
	
	private static final  String JdbcURL = "jdbc:mysql://localhost:8889/projetFero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final  String Username = "root";
	private static final  String password = "root";
    
	
	
	
	/**
	 * conn qui contient le driver +URL+UserName+Password
	 * @author lry41=geoffrey
	 * @version 1.0
	 *@return conn
	 */
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
