package Block7;

public class Person implements Comparable<Person> {
    private int nextId = 1;
    private int id;
    private String name;
    private int age;

    public Person (String name, int age){
        this.id = nextId++;
        this.name = name;
        setAge(age);

    }

    public int getId() {
        return id;
    }
    public String getName (){
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            throw new IllegalArgumentException("Negative Age");
        }
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
}