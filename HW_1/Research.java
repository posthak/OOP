package HW_1;

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
                        t.getP1().getFullName() + " (возраст: " + t.getP1().getAge() + " Пол: " + t.getP1().getGender()
                                + ") и " + t.getP2().getFullName()
                                + " (возраст: " + t.getP2().getAge() + ", Пол: " + t.getP2().getGender()
                                + ") - родители\n");
            } else {
                result.add(t.getP2().getFullName() + " (возраст: " + t.getP2().getAge() + ", Пол: "
                        + t.getP2().getGender() + ")" + " - ребенок \n");

            }
        }

        return result;
    }

}