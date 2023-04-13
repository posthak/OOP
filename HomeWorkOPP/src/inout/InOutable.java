package HomeWorkOPP.src.inout;

import HomeWorkOPP.src.geotree.GeoTree;

public interface InOutable<E> {
    void fileUpload(GeoTree<E> t);

    GeoTree<E> fileDownload();
}
