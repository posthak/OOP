package HomeWorkOPP.src.inout;

import HomeWorkOPP.src.geotree.GeoTree;

public interface InOutable {
    void fileUpload(GeoTree t);

    GeoTree fileDownload();
}
