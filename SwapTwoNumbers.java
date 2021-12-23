import java.util.Scanner;
public class SwapTwoNumbers 
{
public static void main(String[] args)
 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Numbers before swapping are:");
		System.out.println("a =" + a +"  b ="+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swapping are:");
		System.out.println("a ="+ a +"  b ="+ b);

	}

}
