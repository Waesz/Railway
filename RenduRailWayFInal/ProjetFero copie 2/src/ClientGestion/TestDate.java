package ClientGestion;


import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * inutile test 
 * @author lry41=geo
 * @version 1.0
 *
 * */

public class TestDate {

 
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