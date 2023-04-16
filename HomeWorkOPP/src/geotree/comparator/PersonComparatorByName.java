package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;
import HomeWorkOPP.src.person.Person;

public class PersonComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFullName().compareTo(p2.getFullName());
    }
}
