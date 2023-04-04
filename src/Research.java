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
            if (t.getP1().getFullName() == p.getFullName() || t.getP2().getFullName() == p.getFullName()) {
                if (t.getRe() == Relationship.parent) {
                    result.add(t.getP1().getFullName() + " и " + t.getP2().getFullName() + " " + "родители");
                } else {
                    result.add(t.getP2().getFullName() + " ребенок");
                }
            }
        }
        return result;
    }

    public ArrayList<String> AllTree() {
        for (Node t : tree) {
            if (t.getRe() == Relationship.parent) {
                result.add(
                        t.getP1().getFullName() + " (возраст: " + t.getP1().getAge() + ") и " + t.getP2().getFullName()
                                + " (возраст: " + t.getP2().getAge() + ") родители");
            } else {
                result.add(t.getP2().getFullName() + " ребенок");
            }
        }

        return result;
    }

}