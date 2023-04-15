package HomeWorkOPP.src;

import java.util.List;

import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.geotree.GroupElement;

public class Service<E extends GroupElement> {

    private GeoTree<E> geoTree;

    public Service(GeoTree<E> geoTree) {
        this.geoTree = geoTree;
    }

    public void sortByName() {
        geoTree.sortByName();
    }

    public void sortByAge() {
        geoTree.sortByAge();
    }

    public void addPerson(E person) {
        geoTree.addPerson(person);
    }

    public void addNode(E p1, Relationship relation, E p2) {
        addPerson(p1);
        addPerson(p2);
        geoTree.addNode(p1, relation, p2);
    }

    public List<Node<E>> findByPerson(E p1) {
        return geoTree.findByPerson(p1);
    }
}