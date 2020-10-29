import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inscrit {

	private int id_inscrit;
	private boolean admin;
	private String mdp;
	private String mdpValide;
	
	private String email="geo#orange.fr";
	private String nom="leroy";
	private String prenom="geo";
	private String  typeAbo="A";
	private double recetteMonth;
	private String emailR;
	private String mdpR="A";
	
	//private float solde;
	
	private String erreur;
	private String requetTotal;
	
	
	
	public Inscrit( String nom,String prenom,String mdp,String email,String typeAbo , boolean admin) {
		
		this.mdp=mdp;
		this.email=email;
		this.nom=nom;
		this.prenom=prenom;
		this.typeAbo=typeAbo;
		this.admin=admin;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTypeAbo() {
		return typeAbo;
	}

	public void setTypeAbo(String typeAbo) {
		this.typeAbo = typeAbo;
	}
	
	public int getId_inscrit() {
		return id_inscrit;
	}

	public void setId_inscrit(int id_inscrit) {
		this.id_inscrit = id_inscrit;
	}
/*
	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
*/


	public String descripAbo() {
		if(typeAbo=="a") {
			return"Abonnement etudiant vous payez uniquement 5e pour chaques trajets     "; // CE SONT DES EXEMPLES 
		}
		else if(typeAbo=="b") {
			return"Client cette abonnement vous permet de -10% sur le billet en payant 15e en plus par mois    ";
		}
		return"Client regulier cette abonnement vous permet de payer -20% sur le billet en payant 20e en plus par mois      ";
		
	}
	
	public String DefTypeAbo() {
			if (typeAbo=="c") {
				
				return"vous n'avez pas d'abonnement";
			}
			
			else {
				return"vous avez pas un abonnement de type "+ getTypeAbo();
			}
	
	}

	public String toString() {
		return "A FAIRE "; // a faire 
	}
	
	
	public String Inscription() {
		//FAIRE CONDITION POUR L'ENVOI
			if ( nom!=null&& prenom.matches("[a-z]")) {
				
			
				if ( prenom!=null && prenom.matches("[a-z]")) {
					
					// faire les prenoms composé 					
				
					if ( mdp!=null && mdp.length()>=8 && mdp.length()<=25)//^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$ {
						if(mdp==mdpValide) {
						
					
						if ( email.matches(".+@.+\\.[a-z]+")) {
							
						
							if (typeAbo!=null && typeAbo.matches("[a-d]"))
								{
								
								if(mdp.matches("")) //Mettre specification mdp pour admin
										{
									
								//return setRequetTotal("INSERT INTO PERSONNE (nom,prénom,mdp,email,typeAbo) VALUES ('a','b','c','d','e')");
								return  requetTotal="INSERT INTO PERSONNE (nom,prenom,mdp,email,typeAbo) VALUES ('"+nom+"','"+prenom+"','"+mdp+"','"+email+"','"+typeAbo+"')";
								
								/*String requetePrenom="INSERT INTO PERSONNE (prénom) VALUES ("+prenom+")";
								String requeteMdp="INSERT INTO PERSONNE (mdp) VALUES ("+mdp+")";
								String requeteEmail ="INSERT INTO PERSONNE (email) VALUES ("+email+")";
								String requeteTypeAbo="INSERT INTO PERSONNE (typeAbo) VALUES ("+typeAbo+")";*/
		
								//System.out.println("Félicitation ! Votre compte a bien été créer !");
								
											}
				
									else {
										return erreur ="Désolé ! Veuillez renseigne votre type abo";
									}
			
								}
								else {
									
									return erreur ="Désolé ! Veuillez renseigne un email correct ";
										}
						}else {
							return erreur ="Désolé! Vos mots de passes renseignées ne sont pas identiques";
						}
					
				}else {
					return erreur ="Désolé ! Veuillez renseigne un mdp de taille comprise entre 8 et 25";
				}
						}else {
					
					return erreur ="Désolé ! Veuillez renseigne un prenom composé uniquement de lettre ";		
						}
					}else {
						return erreur ="Désolé ! Veuillez renseigne nom composé uniquement de lettre ";
					}
			return erreur ="erreur";
			
	}

	public String getRequetTotal() {
		return requetTotal;
	}

	public String setRequetTotal(String requetTotal) {
		this.requetTotal = requetTotal;
		return requetTotal;
	}
	
	
			// CONNEXION
	
								
		/*						
								

	if (emailR!=null && mdpR!=null) {  
		
						String validation= "SELECT prénom FROM Personne WHERE email = 'emailR'";
						
						
						
						String validationAll="SELECT nom FROM Personne WHERE email = 'emailR' AND mdp = 'mdpR'";
						
							//CODE OUVERTURE SESSION



							
							 }
						else {

							$erreurC = "DSL ! Mauvais mot de passe ou mauvais identifant ";
							}				
				}
				else {
					$erreurC="DSL ! Aucun compte n'est associé à ce pseudo , si vous n'avez pas de compte créez en un et rejoignez nous !";
				}

		}	
	else {
			$erreurC = "Veuillez remplir tous les champs obligatoires pour vous connecter";
		}
		*/
			
		
	
					
								
								
			
	




	
	   public static void main(String[] args) {
		 
		  
		
		   String requete ="INSERT INTO PERSONNE (nom,prénom,mdp,email,typeAbo)"
                   +" VALUES ('AMIK', 'take','aaa','niro@orange.fr', 3)";
		   
	      String JdbcURL = "jdbc:mysql://localhost:8889/projetFero?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	      String Username = "root";
	      String password = "root";
	      
	      try {
	        Connection con = DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connected to MySQL database");
	         
	        
	         Statement INSCRIPTION = con.createStatement();
	         INSCRIPTION.executeUpdate(requete);
	         System.out.println("utilisateur créer");
	       
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      	
	   
	   }
	  
	   
	}
	

