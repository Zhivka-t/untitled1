public class TestCase {
    // Static поле: споделено между всички обекти (брои създадените тест кейсове)
    private static int totalTestCases = 0;

    // Private instance полета
    private int id;
    private String title;
    private String status;

    // Конструктор
    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "NOT_RUN";
        totalTestCases++; // Увеличава брояча при всяко създаване на нов обект
    }

    // Getter методи
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    // Static getter за брояча
    public static int getTotalTestCases() {
        return totalTestCases;
    }

    // Setter с валидация за status
    public void setStatus(String status) {
        if ("PASSED".equals(status) || "FAILED".equals(status) || "SKIPPED".equals(status)) {
            this.status = status;
        } else {
            System.out.println("Error: Invalid status '" + status + "'. Allowed values: PASSED, FAILED, SKIPPED.");
        }
    }
}
