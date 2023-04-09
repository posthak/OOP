package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.geotree.Node;

public class NodeComparatorByAge implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        return Integer.compare(o1.getP1().getAge(), o2.getP1().getAge());
    }
}
