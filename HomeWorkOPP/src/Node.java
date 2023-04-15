package HomeWorkOPP.src;

import java.io.Serializable;

public class Node<E> implements Serializable {
    /**
     * Это класс узла
     * 
     * @param p1
     * @param re
     * @param p2
     */

    private E p1;
    private Relationship re;
    private E p2;

    public Node(E p1, Relationship re, E p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    public E getP1() {
        return p1;
    }

    public E getP2() {
        return p2;
    }

    public Relationship getRe() {
        return re;
    }

    @Override
    public String toString() {
        return p1
                + " relationship = " + re
                + " " + p2 + "\n";
        // return String.format("%s - %s - %s\n", p1, re, p2);
    }

}