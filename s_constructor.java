package JavaBasics;

public class s_constructor {
	//Default Constructor
	public s_constructor() {
		
		//constructor will not return value
		//name of constructor should be class name
		// whenever you create an object constructor is called
		//block of code is executed whenever an object is created.
		//compiler will call implicit constructor if you have not defined constructor block
		
		System.out.println("I am running from Constructor");
		
	}
	
	// Parameterized Constructor
	
	public s_constructor(int a, int b) {
		System.out.println("I am running from Constructor with parameter: "  + a + " and " + b);
	}
	
	public s_constructor(String str) {
		System.out.println("I am running from Constructor with String parameter : "  + str);
	}
	
	public void data() {
		
		System.out.println("I am running from Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s_constructor s = new s_constructor();
		s_constructor s2 = new s_constructor(4,5);
		s_constructor s3 = new s_constructor("Hello");  // Can be executed without having parameterized constructor, but default constructor  will need to be removed


	}

}
