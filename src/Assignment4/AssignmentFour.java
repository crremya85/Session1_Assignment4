package Assignment4;
import java.util.Scanner;
/**
 * Below class is created for Typecasting objects created in the class
 **/
public class AssignmentFour {

	/**	 * Variable is declared for the scanner class to call the methods to receive input from the user
	 */
	private static Scanner sc;
	/**
	 * The main method contains all major variable type declarations and the implicit casting is done.
	 */
	public static void main(String[] args) {
		
		byte b; short s; int i; long l; float f; double d;	
		
        sc = new Scanner(System.in);
        
        System.out.println("Enter the Byte Value : ");
        b = sc.nextByte();
        System.out.println("Enter the Short Value : ");
        s = sc.nextShort();
        
        i = (int)b + (int)s;
        l = (long)i + (long)s;
        f = (float)l + (float)i;
        d = (double)f + (double)l;
        
        System.out.println("Value of Integer :"+i);
        System.out.println("Value of Long :"+l);
        System.out.println("Value of Float :"+f);
        System.out.println("Value of Double :"+d);
 	}
}
