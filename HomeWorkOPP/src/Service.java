package HomeWorkOPP.src;

import java.util.ArrayList;
import java.util.List;

import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.geotree.GroupElement;
import HomeWorkOPP.src.geotree.comparator.NodeComparatorByAge;
import HomeWorkOPP.src.geotree.comparator.NodeComparatorByName;

public class Service<E extends GroupElement> {

    private ArrayList<String> result = new ArrayList<>();
    private List<Node<E>> tree;

    public Service(GeoTree<E> geoTree) {
        tree = geoTree.getTree();
    }

    public List<Node<E>> getTree() {
        return tree;
    }

    public void sortByName() {
        getTree().sort(new NodeComparatorByName<E>());
    }

    public void sortByAge() {
        getTree().sort(new NodeComparatorByAge<E>());
    }

    public ArrayList<String> getByElement(E p) {
        for (Node<E> t : tree) {
            if (t.getP1().getFullName() == p.getFullName() || t.getP2().getFullName() == p.getFullName()) {
                if (t.getRe() == Relationship.parent) {
                    result.add(t.getP1().getFullName() + " and " + t.getP2().getFullName() + " "
                            + "Parents");
                } else {
                    result.add(t.getP2().getFullName() + " Child");
                }
            }
        }
        return result;
    }

    public ArrayList<String> getAllTree() {
        for (Node<E> t : tree) {
            if (t.getRe() == Relationship.parent) {
                result.add(
                        t.getP1().getFullName() + " (Age: " + t.getP1().getAge() + " Gender: " +
                                t.getP1().getGender()
                                + ") and " + t.getP2().getFullName()
                                + " (Age: " + t.getP2().getAge() + ", Gender: " + t.getP2().getGender()
                                + ") - Parents\n");
            } else {
                result.add(t.getP2().getFullName() + " (Age: " + t.getP2().getAge() + ",Gender: " +
                        t.getP2().getGender() + ")" + " - Child\n");
            }
        }
        return result;
    }

    // }

}