package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class q_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Date d = new Date();
		
		
		//SimpleDateformat - https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		//Current Time
	    System.out.println(d.toString());
	    System.out.println(sdf.format(d));
	    System.out.println(sd.format(d));
	    
	    
	    

	}

}
