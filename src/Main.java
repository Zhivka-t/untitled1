public class Main {
    public static void main(String[] args) {
        TestCase test1 = new TestCase(1, "Login test");
        TestCase test2 = new TestCase(2, "Checkout test");

        // Извикване на static метода чрез името на класа
        System.out.println("Total test cases created: " + TestCase.getTotalTestCases()); // 2

        // Валидна промяна на статус
        test1.setStatus("PASSED");
        System.out.println("Test 1 status: " + test1.getStatus()); // PASSED

        // Невалидна промяна на статус (ще отпечата грешка и ще запази стария статус)
        test2.setStatus("UNKNOWN");
        System.out.println("Test 2 status: " + test2.getStatus()); // NOT_RUN
    }
}
