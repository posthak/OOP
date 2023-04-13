package HomeWorkOPP.src.geotree;

import java.util.Iterator;
import java.util.List;

import HomeWorkOPP.src.Node;

public class NodeIterator<E> implements Iterator<Node<E>> {
    private int index;
    private List<Node<E>> nodeList;

    public NodeIterator(List<Node<E>> NodeList) {
        this.nodeList = NodeList;
    }

    @Override
    public boolean hasNext() {
        return index < nodeList.size();
    }

    @Override
    public Node<E> next() {
        return nodeList.get(index++);
    }
}
