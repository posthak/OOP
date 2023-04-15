package HomeWorkOPP.src.geotree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeWorkOPP.src.Node;
import HomeWorkOPP.src.Relationship;
import HomeWorkOPP.src.geotree.comparator.PersonComparatorByAge;
import HomeWorkOPP.src.geotree.comparator.PersonComparatorByName;

public class GeoTree<E extends GroupElement> implements Serializable, Iterable<E> {
    private List<Node<E>> nodeList;
    private List<E> personList;

    public GeoTree() {
        this.personList = new ArrayList<>();
        this.nodeList = new ArrayList<>();
    }

    public void sortByName() {
        personList.sort(new PersonComparatorByName<E>());
    }

    public void sortByAge() {
        personList.sort(new PersonComparatorByAge<E>());
    }

    public List<Node<E>> getNodelist() {
        return nodeList;
    }

    public List<E> getPersonList() {
        return personList;
    }

    public void addNode(E p1, Relationship relation, E p2) {
        nodeList.add(new Node<E>(p1, relation, p2));
        nodeList.add(new Node<E>(p2, Relationship.children, p1));
    }

    public List<Node<E>> findByPerson(E p1) {
        List<Node<E>> result = new ArrayList<>();
        for (Node<E> t : nodeList) {
            if (t.getP1() == p1 || t.getP2() == p1)
                result.add(t);
        }
        return result;
    }

    public void addPerson(E person) {
        if (!chekName(person)) {
            this.personList.add(person);
        }
    }

    private Boolean chekName(E person) {
        for (E t : personList) {
            if (t.getFullName() == person.getFullName()) {
                return true;
            }
        }
        return false;
    }

    // @Override
    public Iterator<E> iterator() {
        return new PersonIterator<E>(personList);
    }
}