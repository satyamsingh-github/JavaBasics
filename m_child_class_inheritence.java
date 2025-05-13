package JavaBasics;

public class m_child_class_inheritence extends l_parent_class_inheritence{
	
	// functions overriding 
	public void Gear() {

       }
	// functions overriding 
	public void engine() {
		System.out.println(color);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m_child_class_inheritence a = new m_child_class_inheritence();
		a.engine();
		a.Gear();
		a.Break();
		
	}
}
