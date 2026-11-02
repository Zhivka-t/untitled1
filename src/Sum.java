public class Sum {
    public static void main(String[] args) {
        int number = 472;
        int originalNumber = number; // Keep track of the original value

        // 1. Extract the hundreds digit
        int hundreds = number / 100;    // 472 / 100 = 4

        // 2. Extract the tens digit
        int tens = (number / 10) % 10;  // 472 / 10 = 47, then 47 % 10 = 7

        // 3. Extract the ones digit
        int ones = number % 10;         // 472 % 10 = 2

        // 4. Calculate the total sum
        int sum = hundreds + tens + ones;

        // Output the result
        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
    }
}
