import java.util.Scanner;
public class PrimeFactors 
{
	public static void main(String[] args) 
{
		System.out.println("Enter number to find Prime Factors");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Prime factors of "+ number + " are");
		for(int i=2; i*i<=number; i++) {
			while(number % i == 0) {
					number = number / i;
					System.out.print(i+" x ");
				}
			}
		if(number != 1) {
			System.out.print(number);
		}
	}
}

