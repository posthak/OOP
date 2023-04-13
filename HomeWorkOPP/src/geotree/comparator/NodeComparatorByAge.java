package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.Node;
import HomeWorkOPP.src.geotree.GroupElement;

public class NodeComparatorByAge<E extends GroupElement> implements Comparator<Node<E>> {
    @Override
    public int compare(Node<E> o1, Node<E> o2) {
        return Integer.compare(o1.getP1().getAge(), o2.getP1().getAge());
    }
}
