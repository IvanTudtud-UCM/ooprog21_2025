// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher - Housewares Department

import java.util.Scanner;

public class DebugFive3
{
    public static void main(String[] args) // Added [] to args for proper syntax
    {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter item number >> ");
        item = input.nextInt();

        // Fixed condition item < LOW
        if (item < LOW)
            output = "Item number too low";
        // Fixed typo HIGHH to HIGH
        else if (item > HIGH)
            output = "Item number too high";
        // Corrected condition less than CUTOFF means Automotive
        else if (item < CUTOFF)
            output = "Valid - Item in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";

        System.out.println(output);
    }
}
