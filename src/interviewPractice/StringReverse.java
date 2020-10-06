package interviewPractice;

public class StringReverse {
	// as String is a Immutable class we cannt reverse string by .reverse(infact .reverse is not available in String class)
	
	//int
	
	//Integer
	
	int a = 80; 
	
	public static void main(String[] args) {
	
		String s = "Selenium";
		int len = s.length();
		String rev ="";
		
	
		for (int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
	
		System.out.println(rev);
	}

}
