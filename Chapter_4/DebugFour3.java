// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int w, l, h;
        System.out.print("Enter width of box >> ");
        w = input.nextInt(); // fixed nextInteger() to nextInt()
        System.out.print("Enter length of box >> ");
        l = input.nextInt(); // fixed nextDouble() to nextInt()
        System.out.print("Enter height of box >> ");
        h = input.nextInt();
        
        DebugBox box1 = new FixDebugBox(); // fixed variable name to box2 for default constructor
        DebugBox box2 = new FixDebugBox(w, l, h); // fixed variable name to box2

        System.out.println("The dimensions of the first box are");
        box1.showData();
        System.out.print(" The volume of the first box is ");
        showVolume(box1);
        System.out.println("The dimensions of the second box are");
        box2.showData();
        System.out.print(" The volume of the second box is ");
        box2.showVolume();
    }

    public static void showVolume(DebugBox aBox)
    {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
