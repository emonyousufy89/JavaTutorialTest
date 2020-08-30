package interviewPractice;

public class StringReverseBuffer {

	public static void main(String[] args) {
		
		String s = "Cucumber";
		
		StringBuffer sbf = new StringBuffer(s);
		
		 System.out.println(sbf.reverse());
		
		StringBuilder SB =new StringBuilder(s);
		System.out.println(SB.reverse());
	}

}
