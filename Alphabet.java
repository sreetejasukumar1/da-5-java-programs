
import java.util.Scanner;
public class Alphabet
 {
public static void main(String[] args)
 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet to check vowel or consonant");
		String alphabet = sc.nextLine();
		switch(alphabet) {
			case "a":
			case "A":
				System.out.println(alphabet+" is vowel");
				break;
			case "e":
			case "E":
				System.out.println(alphabet+" is vowel");
				break;
			case "i":
			case "I":
				System.out.println(alphabet+" is vowel");
				break;
			case "o":
			case "O":
				System.out.println(alphabet+" is vowel");
				break;
			case "u":
			case "U":
				System.out.println(alphabet+" is vowel");
				break;
			default:
				System.out.println(alphabet+" is consonant");
		}
	}
}
