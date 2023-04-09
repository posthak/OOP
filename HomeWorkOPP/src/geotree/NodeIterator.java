package HomeWorkOPP.src.geotree;

import java.util.Iterator;
import java.util.List;

public class NodeIterator implements Iterator<Node> {
    private int index;
    private List<Node> nodeList;

    public NodeIterator(List<Node> NodeList) {
        this.nodeList = NodeList;
    }

    @Override
    public boolean hasNext() {
        return index < nodeList.size();
    }

    @Override
    public Node next() {
        return nodeList.get(index++);
    }
}
