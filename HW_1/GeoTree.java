package HW_1;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Relationship relation, Person p2) {
        tree.add(new Node(p1, relation, p2));
    }

}