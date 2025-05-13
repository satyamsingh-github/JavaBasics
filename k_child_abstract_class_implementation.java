package JavaBasics;

public class k_child_abstract_class_implementation extends j_parent_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k_child_abstract_class_implementation a = new k_child_abstract_class_implementation();
		a.engineGuide();
		a.colorGuide();
		a.safetyGuide();

	}

	@Override
	public void colorGuide() {
		// TODO Auto-generated method stub
		System.out.println("Safron Color");
	}

}
