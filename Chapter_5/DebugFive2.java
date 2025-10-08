// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2
{
    public static void main(String[] args) // Added [] to args for proper syntax
    {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt(); // Added parentheses () to call nextInt()

        System.out.print("Enter another number: ");
        num2 = input.nextInt(); // Added parentheses () to call nextInt()

        // Changed '&&' to '||' and corrected the condition inside the parentheses
        if ((num % num2 == 0) || (num2 % num == 0))
        {
            System.out.println("One of these numbers is");
            System.out.println("evenly divisible into the other.");
        }
        else
        {
            System.out.println("Neither of these numbers is");
            System.out.println("evenly divisible into the other.");
        }
    }
}
