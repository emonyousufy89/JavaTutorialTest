package JavaBasicPractice;

public class ForLoopPractOne {

	public static void main(String[] args) {
		
		for(int i=1; i<5; ++i) {
			System.out.println("emon");
		}
		double a = 22;
		double b=7;
		double c= a/b;
		
		System.out.println("Actual number :" + c);
		System.out.println();
		
		String str = String.format("%.3f", c);
		System.out.println("the new  formet is: "+ str);
		
		double db= Double.parseDouble(str);
		double dbc = db+10;
		System.out.println("after addition :" + dbc);
		
		System.out.printf("%.3f",c);
	}

}
