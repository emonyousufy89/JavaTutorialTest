package interviewPractice;

public class RemoveJunkString {

	public static void main(String[] args) {
		String s = "This Is a Nothing 123456789 $##@#@##@*&%*&";
		
		// RegularExpression: [a-zA-Z1-9]
		
		s = s.replaceAll("[^a-z A-Z1-9]", "");
		
		System.out.println(s);

	}

}
