package JavaBasics;

public class w_static_keyword {
	
	//Instance variables in Java are non-static variables declared in a class outside any method, constructor, or block. 
	//Each object of the class has its own copy of instance variables. 
	String name;
	String address;
	int j=0;
	
	//a static variable, also known as a class variable, is a variable that is associated with the class itself rather than with any specific instance (object) of the class. 
	static String city,district,state;
	static int i=0;
	
	// a static block, also known as a static initialization block, is a block of code within a class that is executed only once when the class is first loaded into memory
	static {
		district = "US Nagar";
		city = "Sitarganj";
		state = "UK";
		
	}
	
	w_static_keyword (String name, String address){
	
	//A local variable in Java is a variable declared within a method, constructor, or block of code. 
	//Its scope is limited to the block where it is declared, meaning it can only be accessed and used within that specific block	
		
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public void getAddress() {
		System.out.println(address + " " + city);
	}
	
	//A static method only accepts static variables
	//A static method is a method that belongs to the class itself rather than to a specific instance of the class.
	
	
	public static void getCity() {
		System.out.println(city + " " + district + " " + state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		w_static_keyword obj = new w_static_keyword("Satyam","Aashirvad Enclave");
		w_static_keyword obj1 = new w_static_keyword("Satya","Neelam Enclave");
		obj.getAddress();
		obj1.getAddress();
		
		
		getCity(); //A static method can be called directly using the class name, without needing to create an object of the class. 
		w_static_keyword.getCity();
		w_static_keyword.i=4;
		System.out.println(i);
		
		

	}

}
