package HomeWorkOPP.src.geotree;

import java.util.List;

import HomeWorkOPP.src.Node;
import HomeWorkOPP.src.Relationship;

public interface Tree<E> extends Iterable<Node<E>> {
    void append(E p1, Relationship relation, E p2);

    List<Node<E>> getTree();
}
