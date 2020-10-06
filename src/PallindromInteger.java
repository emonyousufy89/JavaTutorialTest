
public class PallindromInteger {

	public static void main(String[] args) {
		
		int a = 12321;
		int re = 0;
		
		for (int i=5;i>0; i--) {
			re = re*10 + a%10;
			a=a/10;
			System.out.println("testing:  " +re);
		}
		System.out.println(re);
		
		if (a!=re) {
			System.out.println("this is a pallindrom number :  " + re);
		}
		else {
			System.out.println("not a pallindrome number");
		}
	}

}