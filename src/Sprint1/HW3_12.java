package Sprint1;
import java.util.Scanner;
public class HW3_12 {
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a three-digit integer: ");
	      String threeDigit = input.nextLine();
	      char ch1 = threeDigit.charAt(0);
	      char ch2 = threeDigit.charAt(1);
	      char ch3 = threeDigit.charAt(2);
	      
	      if(Character.isDigit(ch1) && Character.isDigit(ch2) && Character.isDigit(ch3)) {
	    	  if(ch1==ch3)
	    		  System.out.print(threeDigit + " is a palindrome");
	    	  else System.out.print(threeDigit + " is not a palindrome");
	      }
	      }
	}


