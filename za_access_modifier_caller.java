package JavaBasics;



public class za_access_modifier_caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		za_access_modifier  obj = new za_access_modifier();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
		
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.d);
		
		
		//public allows access from anywhere, 
		//private limits access to the declaring class only,
		//protected grants access to subclasses and within the same package, 
		//and default (no keyword) limits access to the same package		

	}

}
