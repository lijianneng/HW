package Sprint1;
import java.util.Scanner;

public class HW3_2 {
	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int number3 = (int)(Math.random()*10);
		
		System.out.print(
			"What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + number + " is " + 
		(number1 + number2+ number3 == number));
	

	}
}
