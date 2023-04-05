package HomeWorkOPP;

public class Person {
    private String fullName;
    private String Age;
    private Gender Gender;

    public Person(String fullName, Gender Gender, String Age) {
        this.fullName = fullName;
        this.Gender = Gender;
        this.Age = Age;

    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return Age;
    }

    public Gender getGender() {
        return Gender;
    }

    // @Override
    // public String toString() {
    // return "Person{" +
    // "name='" + fullName + '\'' +
    // ", Age=" + Age +
    // ", Gender='" + Gender + '\'' +
    // '}';
    // }
}