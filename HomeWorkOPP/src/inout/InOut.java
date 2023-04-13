package HomeWorkOPP.src.inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import HomeWorkOPP.src.geotree.GeoTree;

public class InOut<E> implements InOutable<E> {

    @Override
    public void fileUpload(GeoTree<E> t) {
        // try (// TODO Auto-generated method stub
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("person.out"));

            objectOutputStream.writeObject(t);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public GeoTree<E> fileDownload() {
        // TODO Auto-generated method stub
        GeoTree<E> gt = null;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(
                    new FileInputStream("person.out"));

            gt = (GeoTree<E>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return gt;
    }
}
