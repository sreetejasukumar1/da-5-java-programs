import java.util.Scanner;
public class PowerOf2 
{
	public static void main(String[] args) 
{
		int result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit N");
		int N = sc.nextInt();
		if(N >= 0 && N < 31) {
		System.out.println("Table of power of 2 till 2^"+ N +" is");
		System.out.println("1");
			for(int i=0; i < N; i++) {
			result = result * 2;
			System.out.println(result);
			}
		}
		else {
			System.err.println("Enter limit between 0 to 31");
		}
	}
}
