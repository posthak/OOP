package HomeWorkOPP.src.geotree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeWorkOPP.src.Node;
import HomeWorkOPP.src.Relationship;

public class GeoTree<E> implements Serializable, Tree<E> {
    private List<Node<E>> tree = new ArrayList<>();
    // private List<Node> nodeList;

    @Override
    public List<Node<E>> getTree() {
        return tree;
    }

    @Override
    public void append(E p1, Relationship relation, E p2) {
        tree.add(new Node<E>(p1, relation, p2));
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return new NodeIterator<E>(tree);
    }
}