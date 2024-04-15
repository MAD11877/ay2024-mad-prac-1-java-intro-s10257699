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
    double height = in.nextDouble();

    // Prompt user for weight
    double weight = in.nextDouble();

    // Calculate BMI
    double bmi = weight / (height * height);
    System.out.print(bmi);
  }
}



