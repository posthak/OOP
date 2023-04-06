package HomeWorkOPP;

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
                    result.add(t.getP1().getFullName() + " and  " + t.getP2().getFullName() + " " + "Parents");
                } else {
                    result.add(t.getP2().getFullName() + " Child");
                }
            }
        }
        return result;
    }

    public ArrayList<String> allTree() {
        for (Node t : tree) {
            if (t.getRe() == Relationship.parent) {
                result.add(
                        t.getP1().getFullName() + " (Age: " + t.getP1().getAge() + " Gender: " + t.getP1().getGender()
                                + ") and  " + t.getP2().getFullName()
                                + " (Age: " + t.getP2().getAge() + ", Gender: " + t.getP2().getGender()
                                + ") - Parents\n");
            } else {
                result.add(t.getP2().getFullName() + " (Age: " + t.getP2().getAge() + ", Gender: "
                        + t.getP2().getGender() + ")" + " - Child \n");

            }
        }

        return result;
    }

}