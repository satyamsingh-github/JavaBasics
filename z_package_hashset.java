package JavaBasics;

import java.util.HashSet;

public class z_package_hashset {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub		
			
			HashSet<String> b = new HashSet<String>();
			
			//Class A can use Class B directly by creating object if both Class A and Class B belongs to same package.
			y_packages_arraylist obj = new y_packages_arraylist();
			obj.getData();

		}

	}




