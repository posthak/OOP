package HomeWorkOPP.src.geotree;

import java.io.Serializable;

import HomeWorkOPP.src.person.Person;

public class Node implements Serializable {
    /**
     * Это класс узла
     * 
     * @param p1
     * @param re
     * @param p2
     */

    private Person p1;
    private Relationship re;
    private Person p2;

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public Relationship getRe() {
        return re;
    }

    @Override
    public String toString() {
        return String.format("<%s>", p1);
    }
    // @Override
    // public String toString() {
    // return String.format("<%s - %s - %s>", p1, re, p2);
    // }

}