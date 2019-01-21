package Sprint1;
import java.util.Scanner;

public class HW4_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
		char ch1 = Character.toUpperCase(ch);
		
		if (ch1 >= 'W')
			System.out.print("The corresponding number is " + 9);
		else if (ch1 >= 'T')
			System.out.print("The corresponding number is " + 8);
		else if (ch1 >= 'P')
			System.out.print("The corresponding number is " + 7);
		else if (ch1 >= 'M')
			System.out.print("The corresponding number is " + 6);
		else if (ch1 >= 'J')
			System.out.print("The corresponding number is " + 5);
		else if (ch1 >= 'G')
			System.out.print("The corresponding number is " + 4);
		else if (ch1 >= 'D')
			System.out.print("The corresponding number is " + 3);
		else if (ch1 >= 'A')
			System.out.print("The corresponding number is " + 2);
		else
			System.out.print(ch1 + " is an invalid input");
	}

}
