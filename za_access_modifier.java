package JavaBasics;

public class za_access_modifier {

	//Default, Public, Private, Protected	
	
	int a = 4;
	public int b = 5;
	private int c = 6;
	protected int d = 7;
	
	//Default : Access method anywhere only in package
	void defaultMethod() {
		
		System.out.println("Default Access Modifier ");
	}
	
	//Public : Access across all package or everywhere
	public void publicMethod() {
		
		System.out.println("Public Access Modifier ");
	}
	
	//Method or variable cannot be accessed outside the class
	private void privateMethod() {
		
		System.out.println("Private Access Modifier ");
	}
	
	//Method or variable cannot be accessed outside the class
	protected void protectedMethod() {
		
		System.out.println("Protected Access Modifier ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

}
