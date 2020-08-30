package interviewPractice;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int a []= {1,2,4,5};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		int sam =0;
		for(int j=1; j<=5; j++) {
			sam =sam + j;
		}
		System.out.println(sam);
		
		System.out.println("the missing number is :"+ (sam - sum));
	}
	

}
