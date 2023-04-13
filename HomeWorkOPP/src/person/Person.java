package HomeWorkOPP.src.person;

import java.io.Serializable;

import HomeWorkOPP.src.geotree.GroupElement;

public class Person implements Serializable, GroupElement {
    private String fullName;
    private Integer Age;
    private Gender Gender;

    public Person(String fullName, Gender Gender, Integer Age) {
        this.fullName = fullName;
        this.Gender = Gender;
        this.Age = Age;

    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public Integer getAge() {
        return Age;
    }

    @Override
    public Gender getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                '}' + "\n";
    }

}