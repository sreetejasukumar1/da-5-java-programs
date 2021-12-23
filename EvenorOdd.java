import java.util.Scanner;
public class EvenorOdd {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check even or odd");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println(number+" is even");
		}
		else {
			System.out.println(number+" is odd");
		}
	}
}
