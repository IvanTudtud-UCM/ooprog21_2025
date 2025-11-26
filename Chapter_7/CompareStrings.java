import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        String name = "Carmen"; 

        if (input.equals(name)) {
            System.out.println(name + " equals " + input);
        } else {
            System.out.println(name + " does not equal " + input);
        }
    }
}
