import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate = 0.03;
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance: ");
        balance = input.nextDouble();

        do {
            System.out.print("Do you want to see next year's balance?\n1 for Yes 2 for No: ");
            choice = input.nextInt();

            if (choice == 1) {
                balance += balance * interestRate;
                System.out.printf("After year %d at %.2f%% interest rate, balance is $%.2f\n",
                                  year, interestRate * 100, balance);
                year++;
            } 
            else if (choice != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        } 
        while (choice != 2);

        System.out.printf("\nFinal balance is: $%.2f\n", balance);
        input.close();
    }
}
