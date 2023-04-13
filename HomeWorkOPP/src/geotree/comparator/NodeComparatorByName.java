package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.Node;
import HomeWorkOPP.src.person.Person;

public class NodeComparatorByName<E extends Person> implements Comparator<Node<E>> {
    @Override
    public int compare(Node<E> p1, Node<E> p2) {
        return p1.getP1().getFullName().compareTo(p2.getP1().getFullName());
    }
}
