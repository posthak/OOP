package HomeWorkOPP.src.inout;

import HomeWorkOPP.src.geotree.GeoTree;

public interface InOutable<Person> {
    void fileUpload(GeoTree<Person> t);

    GeoTree<Person> fileDownload();
}
