package JavaBasics;

public class v_this_keyword {

	int a=2;
	
	public void getData() {
		
		//this keyword is a reference to the current object instance. 
		//It is used to access members (fields and methods) of the current object and to differentiate between instance variables and local variables or method parameters with the same name. 
		
		int a=3;
		int c= a+this.a;
		System.out.println("I am printing number declared inside the method: " + a);
		System.out.println("Using this keyword I am printing number declared in the class object: " + this.a);
		System.out.println("Sum is:  " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		v_this_keyword th = new v_this_keyword();
		th.getData();

	}

}
