package OldHomeWorks;

public class PyramidPatternr {
	
	
	public static void pyramid(int n) {
		
		for(int i=0; i<n; i++) {
			System.out.print(" ");
		
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}

	public static void main(String [] args) {
		
	int n = 5;
	pyramid(n);
		
		
	}
	
}

