package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ConnectionBdFero.ConnectionBdFero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginGestion implements Initializable{

	@FXML private TextField emailCo;
	@FXML private PasswordField passwordCo;
	@FXML private Label etatCo;
	
	
	
	
	@FXML
	public void login(ActionEvent event) throws SQLException {
		Connection con=ConnectionBdFero.connect();
		PreparedStatement stat = null;
		ResultSet rs= null;
		String sql="SELECT * FROM Personne WHERE email = ? AND mdp = ?";
				try {
					stat = con.prepareStatement(sql);
					stat.setString(1, emailCo.getText().toString()); 
					stat.setString(2, passwordCo.getText().toString()); 
					rs=stat.executeQuery();
					if(rs.next()) {
						etatCo.setText("connecté");
					}
					else {
						etatCo.setText("Votre mail ou votre mot de passe est incorrect");
					}
				}catch 
					(Exception e ){
						
					}
				}
		
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
