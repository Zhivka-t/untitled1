public class LNum {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 20;

        if (a >= b) {
            if (a >= c) {
                System.out.println("Largest: " + a);
            } else {
                System.out.println("Largest: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Largest: " + b);
            } else {
                System.out.println("Largest: " + c);
            }
        }
    }
}




//Given three integers, print the largest using nested if statements (no Math.max).