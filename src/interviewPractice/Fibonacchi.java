package interviewPractice;

public class Fibonacchi {

	public static void main(String[] args) {
		
		int a=0, b=1,c=0;
		
		//System.out.println("1 1 ");
		
//while(c<=50) {
//	c=a+b;
//	//System.out.println(c + " ");
//	
//	a=b;
//	b=c;
//	System.out.println("numbers:" + c + " ");
//}

for (int i=0; i<10; i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(a + " ");
}
	}

}
