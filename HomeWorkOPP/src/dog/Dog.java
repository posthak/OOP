package HomeWorkOPP.src.dog;

import java.io.Serializable;
import HomeWorkOPP.src.geotree.GroupElement;
import HomeWorkOPP.src.person.Gender;

public class Dog implements Serializable, GroupElement {
    private String fullName;
    private Integer age;
    private Gender gender;

    public Dog(String fullName, Gender gender, Integer age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'' +
                '}' + "\n";
    }

}