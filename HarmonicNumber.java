import java.util.Scanner;
public class HarmonicNumber 
{
	public static void main(String[] args)
{
		double harmonicSum = 0.0;
		System.out.println("Enter the limit N");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N > 0) {
			for(int i=1; i<=N; i++) {
			harmonicSum = harmonicSum + (double) 1 / i;
			}
			System.out.println("Sum of "+ N +"th harmonic number series is "+ harmonicSum);
		}
		else
		{
			System.err.println("Enter positive Nth limit");
		}
	}
}
