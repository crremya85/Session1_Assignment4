package Assignment3;
import java.util.Scanner;
/**
 * This class is created to know the difference between Bitwise and logical AND operator
 *
 */
public class AssignmentThree {
	
		/**
		 * Scanner class is imported using import comment with which user can get the inputs
		 * for the variables initialized in the main program.
		 * 
		 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		byte a,b,c,d;
		
		System.out.println("Enter the value of A:" );
		a=s.nextByte();
		System.out.println("Enter the value of B:" );
		b=s.nextByte();
		System.out.println("Enter the value of C:" );
		c=s.nextByte();
		System.out.println("Enter the value of D:" );
		d=s.nextByte();
		
		// Bitwise AND
		System.out.println(a>b&c<d);
		// Logical AND
		System.out.println(a>b&&c>d);
	}
}
