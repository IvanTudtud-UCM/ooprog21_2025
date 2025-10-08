// DebugFive4.java
// Outputs highest of four numbers

import java.util.*;

public class DebugFive4
{
    public static void main(String[] args) // Added [] to args for proper syntax
    {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);

        // Each input should go to a different variable
        System.out.print("Enter an integer >> ");
        one = input.nextInt();

        System.out.print("Enter an integer >> ");
        two = input.nextInt(); // two instead of one

        System.out.print("Enter an integer >> ");
        three = input.nextInt(); // three instead of one

        System.out.print("Enter an integer >> ");
        four = input.nextInt(); // four instead of one

        if (one > two && one > three && one > four)
            highest = one;
        else if (two > one && two > three && two > four) // Changed || to && 
            highest = two;
        else if (three > one && three > two && three > four) // Changed == to > for proper logic
            highest = three;
        else
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}
