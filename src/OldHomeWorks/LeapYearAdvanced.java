package OldHomeWorks;

import java.util.Scanner;

public class LeapYearAdvanced {

	public static void main(String[] args) {
//		int year;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter any year:");
//		year = scan.nextInt();
//		scan.close();
//		boolean isLeap = false;		
		
		int year= 2021;
		boolean isLeap = false;
		if(year % 4 == 0){
			if(year % 100 == 0) {
				if(year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}
			else
			isLeap =true;
		}
		else {
			isLeap = false;
		}
		if(isLeap==true)
			System.out.println(year + "  is a Leap year");
		else{
			System.out.println(year + "  is not a Leap year");	
	}


	}
}

