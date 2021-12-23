import java.util.Scanner;
public class QuotientAndRemainder {
	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		int number = sc.nextInt();
		System.out.println("Enter divisor");
		int divisor = sc.nextInt();
		int quotient = number / divisor;
		int remainder = number % divisor;
		System.out.println("Quotient: "+quotient);
		System.out.println("Remainder: "+remainder);
	}
}

