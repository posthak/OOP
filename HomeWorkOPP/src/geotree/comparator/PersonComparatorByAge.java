package HomeWorkOPP.src.geotree.comparator;

import java.util.Comparator;

import HomeWorkOPP.src.geotree.GroupElement;

public class PersonComparatorByAge<E extends GroupElement> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
