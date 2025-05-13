package JavaBasics;

public class h_child_interface_implementation implements g_parent_interface, i_second_parent_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		g_parent_interface a = new h_child_interface_implementation();
		a.greenGO();
		a.yellowMove();
		a.redSTOP();
		
		i_second_parent_interface b = new h_child_interface_implementation();
		b.TrainSymbol();

	}

	@Override
	public void greenGO() {
		// TODO Auto-generated method stub
	System.out.println("Green : You can run");
	}

	@Override
	public void redSTOP() {
		// TODO Auto-generated method stub
		System.out.println("Red : Just stop now!!");
		
	}

	@Override
	public void yellowMove() {
		// TODO Auto-generated method stub
		System.out.println("Yellow : Move but slowly");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train is aproaching : Stop at the gate");
	 
    }
    
		
		
		
}


