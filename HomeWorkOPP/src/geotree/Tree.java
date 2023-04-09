package HomeWorkOPP.src.geotree;

import java.util.List;

import HomeWorkOPP.src.person.Person;

public interface Tree extends Iterable<Node> {
    void append(Person p1, Relationship relation, Person p2);

    List<Node> getTree();
}
