package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;
import HomeWorkOPP.src.geotree.GroupElement;

public class PersonComparatorByName<E extends GroupElement> implements Comparator<E> {
    @Override
    public int compare(E p1, E p2) {
        return p1.getFullName().compareTo(p2.getFullName());
    }
}
