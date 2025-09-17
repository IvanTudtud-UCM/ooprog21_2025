import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  // Use nextDouble() instead of using nextInt()

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  // Use nextDouble() instead of using nextInt()

        calcTip(check1);  // Pass check amount to method
        calcTip(check2);
    }

    // Fixed method to accept a parameter
    public static void calcTip(double bill) {
        final double RATE = 0.15;     // Fixed doubel typo
        double tip;
        tip = bill * RATE; 
        System.out.println("The tip should be at least $" + tip);
    }
}
