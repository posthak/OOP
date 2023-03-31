package src;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> byPerson(Person p) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName || t.p2.fullName == p.fullName) {
                if (t.re == Relationship.parent) {
                    result.add(t.p1.fullName + " и " + t.p2.getFullName() + " " + "родители");
                } else {
                    result.add(t.p2.getFullName() + " ребенок");
                }
            }
        }
        return result;
    }

    public ArrayList<String> AllTree() {
        for (Node t : tree) {
            result.add(t.p1.fullName + " " + t.re + " " + t.p2.fullName + "\n");
        }
        return result;
    }

}