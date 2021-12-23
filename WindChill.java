import java.util.Scanner;
public class WindChill 
{
	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temparature in Fahrenheit");
		double t = sc.nextDouble();
		System.out.println("Enter wind speed in Miles per hour");
		double v = sc.nextDouble();
		if(t < 50 && v <= 120 && v >= 3) {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Effective temperature(the wind chill) is "+w);
		}
		else {
			System.err.println("Enter temperature and wind speed within range as stated");
		}

	}

}
