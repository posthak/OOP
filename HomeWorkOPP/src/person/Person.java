package HomeWorkOPP.src.person;

import java.io.Serializable;


public class Person implements Serializable {
    private String fullName;
    private Integer Age;
    private Gender Gender;

    public Person(String fullName, Gender Gender, Integer Age) {
        this.fullName = fullName;
        this.Gender = Gender;
        this.Age = Age;

    }

    public String getFullName() {
    return fullName;
    }

    public Integer getAge() {
        return Age;
    }

    public Gender getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                '}'+"\n";
    }

}