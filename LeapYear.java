
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year to check whether leap or not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year +" is a Leap Year");
			}
			else
			{
				System.out.println(year +" is a Not Leap Year");
			}
			
		}
		else
		{
			System.err.println("Enter year having four digits only");
		}
		
	}
}
