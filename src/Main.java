public class Main {
    public static void main(String[] args) {
        // Create a TestCase object
        TestCase test1 = new TestCase(34, "Verify credentials");

        // Call the getters to read the private fields
        System.out.println("ID: " + test1.getId());
        System.out.println("Title: " + test1.getTitle());
        System.out.println("Status: " + test1.getStatus());
    }
}

