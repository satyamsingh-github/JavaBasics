package JavaBasics;


//class can be also set to final, but inheritance wont work, as you cannot extend.
final class x_final_keyword {
	
	
	final void getData() {
		System.out.println("This is the implementation of Final keyword in a method ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The final keyword in Java is a non-access modifier used to apply restrictions on classes, methods, and variables. 
		// It essentially signifies that the entity it modifies cannot be changed after initialization or declaration.
		
		
		
		final int i=4; //constant variables
		System.out.println("This is the implementation of Final keyword in a variable: " + i);
		
		x_final_keyword obj = new x_final_keyword();
		obj.getData();
		

	}

}
