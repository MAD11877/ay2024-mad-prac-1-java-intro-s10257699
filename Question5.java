import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for the number of integers
        System.out.print("Enter number of integers: ");
        int numOfIntegers = in.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        // Loop to get input integers
        for (int i = 0; i < numOfIntegers; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = in.nextInt();
            nums.add(num);
        }

        int maxCount = 0;
        int mode = Integer.MIN_VALUE;

        // Loop to find mode
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == nums.get(i)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums.get(i);
            }
        }

        System.out.println("Mode (number with highest occurrence): " + mode);

    }
}

