import java.util.*;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] array = new int[5];

        display("Original array:           ", array);

        Arrays.fill(array, 8);
        display("After filling with 8s:      ", array);

        array[2] = 6;
        array[4] = 3;
        display("After changing two values:  ", array);

        Arrays.sort(array);
        display("After sorting:            ", array);
    }

    public static void display(String message, int array[]) {
        System.out.print(message);

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
