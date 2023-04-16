package HomeWorkOPP.src.geotree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeWorkOPP.src.geotree.comparator.PersonComparatorByAge;
import HomeWorkOPP.src.geotree.comparator.PersonComparatorByName;
import HomeWorkOPP.src.person.PersonIterator;
import HomeWorkOPP.src.person.Person;

public class GeoTree implements Serializable, Iterable<Person> {
    private List<Node<Person>> nodeList;
    private List<Person> personList;

    public GeoTree() {
        this.personList = new ArrayList<>();
        this.nodeList = new ArrayList<>();
    }

    public void sortByName() {
        personList.sort(new PersonComparatorByName());
    }

    public void sortByAge() {
        personList.sort(new PersonComparatorByAge());
    }

    public List<Node<Person>> getNodelist() {
        return nodeList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void addNode(Node<Person> node) {
        nodeList.add(node);
    }

    public List<Node<Person>> findByPerson(Person p1) {
        List<Node<Person>> result = new ArrayList<>();
        for (Node<Person> t : nodeList) {
            if (t.getP1() == p1 || t.getP2() == p1)
                result.add(t);
        }
        return result;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void delPerson(Person person) {
        this.personList.remove(person);
    }

    public Person getPerson(String fullName) {
        for (Person t : personList) {
            if (t.getFullName().compareTo(fullName) == 0) {
                return t;
            }
        }
        return null;
    }

    // @Override
    public Iterator<Person> iterator() {
        return new PersonIterator(personList);
    }
}