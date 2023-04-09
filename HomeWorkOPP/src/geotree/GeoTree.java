package HomeWorkOPP.src.geotree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import HomeWorkOPP.src.person.Person;

public class GeoTree implements Serializable, Tree {
    private List<Node> tree = new ArrayList<>();
    // private List<Node> nodeList;

    @Override
    public List<Node> getTree() {
        return tree;
    }

    @Override
    public void append(Person p1, Relationship relation, Person p2) {
        tree.add(new Node(p1, relation, p2));
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(tree);
    }

}