package day1_assignment;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year for which you need to find out if it is leap or not ");
		int year = sc.nextInt();
		while(year>0) {
			if(year%4==0) 
				System.out.println(year+" " +"is a leap year");
			
		
			else 
				System.out.println(year+" " + "is not a leap year");
			break;
			}
		

	}

}
