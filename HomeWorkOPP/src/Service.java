package HomeWorkOPP.src;

import java.util.ArrayList;
import java.util.List;

import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.geotree.Node;
import HomeWorkOPP.src.geotree.Relationship;
import HomeWorkOPP.src.geotree.comparator.NodeComparatorByAge;
import HomeWorkOPP.src.geotree.comparator.NodeComparatorByName;
import HomeWorkOPP.src.person.Person;

public class Service {

    private ArrayList<String> result = new ArrayList<>();
    private List<Node> tree;

    public Service(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public List<Node> getTree() {
        return tree;
    }

    public void sortByName() {
        getTree().sort(new NodeComparatorByName());
    }

    public void sortByAge() {
        getTree().sort(new NodeComparatorByAge());
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