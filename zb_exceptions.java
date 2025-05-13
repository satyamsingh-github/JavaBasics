package JavaBasics;

public class zb_exceptions {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One try can be followed by multiple catch blocks
	
		
		int b = 1;
		int c = 0;
		
		int d[] = new int[5];
		
	    try {	
		     int k=b/c;
			
			System.out.println(k);
			System.out.println(d[10]);
			
			
			
	    }
	
	    // catch blocks should be immediately followed by
	    catch (ArithmeticException et)  //Specific
	    
	    {
	    	System.out.println("Arithmetic Exception " + et);
	    }
	    
	     
	    catch (Exception e) //Generic
	    
	    {
	    	System.out.println(" exception is  " + e); 
	    }
	    
	    //executed both in the case if the code fails or passes
	    finally
	    {
	    	System.out.println("Learning for the exception is complete");
	    }
	    


	}

}
