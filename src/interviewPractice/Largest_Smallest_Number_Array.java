package interviewPractice;

import java.util.Arrays;

public class Largest_Smallest_Number_Array {

	public static void main(String[] args) {
		
		int num [] = {5,7,8,12,34,50,-2,20,21};
		
		int lar = num[0];
		int smal = num[0];
		
		for (int i=1; i<num.length; i++) {
			
			if(num[i]>lar) {
				lar = num[i];
				
			}
			else if(num[i]<smal) {
				smal = num[i];
			}
		}
		System.out.println("\n given array is ::" + Arrays.toString(num));
		System.out.println("Largest number is ::" + lar);
		System.out.println("Smallest number is ::" + smal);
		
	}

}
