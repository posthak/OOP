package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.person.Person;

public class PersonComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
