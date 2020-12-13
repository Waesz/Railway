package application;


import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDate {

  /**
   * @param args
   */
 
    private static  Date aujourdhui = new Date();

    public Date getAujourdhui() {
		return aujourdhui;
	}

	
    
    
    public TestDate(Date aujourdhui) {
    	TestDate.aujourdhui=aujourdhui;
    }
    
    

    static DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
        DateFormat.SHORT,
        DateFormat.SHORT);
	
	 public static void main(String[] args) {


   //System.out.println(shortDateFormat.format(aujourdhui));
    
   
  }

}