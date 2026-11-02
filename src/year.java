public class year {
    public static void main (String[] args) {
        int year = 2026;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Is " + year + " a leap year? " + isLeap);

    }
}
