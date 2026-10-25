public class EX2 {
    public static void main(String[] args) {
        // Use 'long' to prevent integer overflow during multiplication
        long number = 32346;
        long square = number * number;

        // Print the calculated result
        System.out.println("The square of " + number + " is: " + square);
    }
}
