package Sprint1;
import java.util.Scanner;

public class HW3_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The weight of the package in pound: ");
		double w = input.nextDouble();
		
		if (0 < w && w <= 1) 
			System.out.print("The cost is " + 3.5);
		else if (1 < w && w <= 3) 
			System.out.print("The cost is " + 5.5);
		else if (3 < w && w <= 10) 
			System.out.print("The cost is " + 8.5);
		else if (10 < w && w <= 20) 
			System.out.print("The cost is " + 10.5);
		else if (w > 50) 
			System.out.print("the package cannot be shipped.");
	}

}
