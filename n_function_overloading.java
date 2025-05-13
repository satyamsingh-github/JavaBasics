package JavaBasics;

public class n_function_overloading {
	
	// For function overloading
	
		// either argument count should be different OR
	    // argument data type should be different. 
	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		n_function_overloading fo = new n_function_overloading();
		fo.getData(2);
		fo.getData("I am amazing!!");
		fo.getData(3);
		

	}

}
