package interviewPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		int a = 12345;
		int r = 0;
		while(a !=0) {
			r = r*10 + a%10;
			a = a/10;
		}
System.out.println(r);

long b = 1234567;

StringBuffer C = new StringBuffer(String.valueOf(b)).reverse();

System.out.println(C);


	}

}
