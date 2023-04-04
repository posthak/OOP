package src;

public class Person {
    private String fullName;
    private String Age;
    private String Sex;

    public Person(String fullName, String Sex, String Age) {
        this.fullName = fullName;
        this.Sex = Sex;
        this.Age = Age;

    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }
}