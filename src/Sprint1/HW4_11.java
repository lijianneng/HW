package Sprint1;
import java.util.Scanner;

public class HW4_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimalValue = input.nextInt();
				
		if (decimalValue>= 0 && decimalValue <= 9)
			System.out.print("The hex value is " + decimalValue);
		if (decimalValue >= 10 && decimalValue <= 15) {
			char ch = (char)(decimalValue + 55);
		    System.out.print("The hex value is " + ch);}
		if (decimalValue > 15) {
			System.out.println(decimalValue + " is an invalid input");
			}
	}

}
