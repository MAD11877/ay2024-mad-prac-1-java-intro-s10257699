
import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);

    // Prompt user for height
    System.out.print("Enter height (m): ");
    double height = in.nextDouble();

    // Prompt user for weight
    System.out.print("Enter weight (kg): ");
    double weight = in.nextDouble();

    // Calculate BMI
    double bmi = weight / (height * height);
    System.out.print("Your BMI is: " + bmi);

  }
}

