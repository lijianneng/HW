package Sprint1;
import java.util.Scanner;

public class HW4_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city2.compareTo(city3) < 0)
			System.out.println("The cities in alphabetical order are " +
			city1 + " " + city2 + " " + city3);
		if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city2.compareTo(city3) > 0)
			System.out.println("The cities in alphabetical order are " +
			city1 + " " + city3 + " " + city2); 
		if (city1.compareTo(city2) > 0 && city1.compareTo(city3) < 0 && city2.compareTo(city3) < 0)
			System.out.println("The cities in alphabetical order are " +
			city2 + " " + city1 + " " + city3); 
		if (city1.compareTo(city2) > 0 && city1.compareTo(city3) > 0 && city2.compareTo(city3) < 0)
			System.out.println("The cities in alphabetical order are " +
			city2 + " " + city3 + " " + city1);
		if (city1.compareTo(city2) > 0 && city1.compareTo(city3) > 0 && city2.compareTo(city3) > 0)
			System.out.println("The cities in alphabetical order are " +
			city3 + " " + city2 + " " + city1);
		if (city1.compareTo(city2) < 0 && city1.compareTo(city3) > 0 && city2.compareTo(city3) > 0)
			System.out.println("The cities in alphabetical order are " +
			city3 + " " + city1 + " " + city2);
	}

}
