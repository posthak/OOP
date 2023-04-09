package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.geotree.Node;

public class NodeComparatorByName implements Comparator<Node> {
    @Override
    public int compare(Node p1, Node p2) {
        return p1.getP1().getFullName().compareTo(p2.getP1().getFullName());
    }
}
