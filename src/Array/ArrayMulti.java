package Array;

public class ArrayMulti {

	public static void main(String[] args) {
		
		int md [][]  = new int [5][5];
		
		md[0][0]= 1;
		md[0][1]= 10;
		md[1][0]= 2;
		md[1][1]= 20;
		md[2][0]= 3;
		md[2][1]= 30;
		
		for (int i=0; i<=2; i++){ //to print Row value
			for(int j=0; j<=1; j++) { // to print cell value
				System.out.print(md [i][j] + "  ");
			}
			System.out.println();
		}		
//	
		
		Object  f [] [] = {{"john",20},{40,80},{70,60}};
		
		for(Object l [] :f) {
		
		for(Object n : l ) {
			System.out.print(n + "  ");
		}
		System.out.println();
		}
	}
	}

	


