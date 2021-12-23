import java.util.Scanner;
public class LargestAmongThree
 {
public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a+" is greater than "+ b +" and "+c);
		}
		else if (b > c) {
			System.out.println(b+" is greater than "+ a +" and "+c);
		}
		else if (a == b && a == c) {
			System.out.println("All three numbers are equal");
		}
		else  {
			System.out.println(c+" is greater than "+ a +" and "+b);
		}

	}

}
