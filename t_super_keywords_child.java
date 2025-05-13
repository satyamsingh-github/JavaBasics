package JavaBasics;

public class t_super_keywords_child extends u_super_keywords_parent {
	
	//Child Class Constructor
     public t_super_keywords_child() {
    	 super();
    	 System.out.println("I am from Child class Constructor");
     }
	
	String name = "Satyam is quite amazing";
	public void getStringData() {
		System.out.println(name); //preference to local variable is given
		System.out.println(super.name); //preference to parent class variable is given
		
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am from Child class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t_super_keywords_child cd = new t_super_keywords_child();
		cd.getStringData();  
		cd.getData();
		
		
		

	}

}
