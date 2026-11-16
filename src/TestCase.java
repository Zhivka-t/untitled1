public class TestCase {
    // Private полета
    private int id;
    private String title;
    private String status;

    // Конструктор, който приема id и title, а status задава на "NOT_RUN"
    public TestCase(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "NOT_RUN";
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
}

