package JavaBasics;

public class o_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//single dimensional array - 1st Way
		int a[] = new int[5];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;

		for (int arr : a) {
			System.out.println("The single dimensional array values are: " + arr);		
			}
		
		System.out.println();	
		
		//single dimensional array - 2nd Way
		int b[] = {1,2,3,4,5,6,7,8,9};


		for (int arr2 : b) {
			System.out.println("The single dimensional array values are: " + arr2);		
			}
		
		System.out.println();	
		
		//multi dimensional array - 1st Way
		int c[][] = new int[2][2];
		c[0][0] = 3;
		c[0][1] = 4;
		c[1][0] = 5;
		c[1][1] = 6;
		
		
		for (int i=0;i<=1;i++) {
			
			for (int j=0;j<=1;j++) {
				System.out.println("The multi dimensional array value at position " + i + " and " + j + " are: " +  c[i][j]);	
			}
				
			}
		
		System.out.println();	
		
		//multi dimensional array - 2nd Way
		int d[][] = {{7,8,9},{10,11,12},{13,14,15}};
		for (int i=0;i<=2;i++) {
			
			for (int j=0;j<=2;j++) {
				System.out.println("The multi dimensional array value at position " + i + " and " + j + " are: "  +  d[i][j]);	
			}
		}
		
		
		
		//
	}

}
