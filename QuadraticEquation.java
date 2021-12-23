import java.util.Scanner;
public class QuadraticEquation
{
public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		double root1,root2;
		System.out.println("Enter values of a , b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The equation is "+ a +"x^2 + "+ b +"x + "+c);
		int delta = b * b - 4 * a * c;
		root1 = (-b + Math.sqrt(delta))/(2 * a);
		root2 = (-b - Math.sqrt(delta))/(2 * a);
		System.out.println("Root 1 = "+ root1 +"  Root 2 = "+ root2);
	}
}
