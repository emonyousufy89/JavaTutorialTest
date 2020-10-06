
public class pallindrom {

	public static void main(String[] args) {
		String s = "abcban";
		int len= s.length();
		String rev ="";
		
		int a = 565;
		int re=0;
		
		for (int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
	
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("this is pallindrom number :  " + rev);
		}
		else {
			System.out.println("not a pallindrom");
		}
	}

}
