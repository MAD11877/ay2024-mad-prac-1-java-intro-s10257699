import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);

    // Prompt user for integer
    int integer = in.nextInt(); 

    // Multiply the integer by itself andd print
    int integerCalc = integer * integer;    
    System.out.println(integerCalc);
  }
}
