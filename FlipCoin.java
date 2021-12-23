import java.util.Scanner;
public class FlipCoin {
	public static void main(String[] args) {
		 	int head = 0;
		 		Scanner sc = new Scanner(System.in);
				System.out.println("Enter number times coin to Flip");
				int a = sc.nextInt();
				for (int i = 0; i < a; i++) {
				    double flip = Math.random() % 2;
			    if (flip < 0.5) {
				        head++;
				    }
				}
				double percentageOfHeads = (head * 100) / a;
				double percentageOfTails = 100 - percentageOfHeads;
				System.out.println("Percentage of heads is: " +percentageOfHeads);
				System.out.println("Percentage of tails is: " +percentageOfTails);
			}
	}
