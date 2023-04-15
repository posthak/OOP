package HomeWorkOPP.src.person;

import java.io.Serializable;

import HomeWorkOPP.src.geotree.GroupElement;

public class Person implements Serializable, GroupElement {
    private String fullName;
    private Integer age;
    private Gender gender;
    private Person person;

    public Person(String fullName, Gender gender, Integer age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;

    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    // @Override
    // public String toString() {
    // return "Person{" +
    // "name='" + fullName + '\'' +
    // '}' + "\n";
    // }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'' +
                '}' + "\n";
    }

}