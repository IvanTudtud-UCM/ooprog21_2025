public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringB1 = new StringBuilder("Hello");
        StringBuilder stringB2 = new StringBuilder("Hello World!");

        System.out.println("stringB1: " + stringB1 + " | capacity: " + stringB1.capacity());
        System.out.println("stringB2: " + stringB2 + " | capacity: " + stringB2.capacity());

        stringB1.setLength(3);
        stringB2.setLength(10);

        System.out.println("\nAfter setLength():");
        System.out.println("stringB1: " + stringB1 + " | length: " + stringB1.length());
        System.out.println("stringB2: " + stringB2 + " | length: " + stringB2.length());
    }
}
