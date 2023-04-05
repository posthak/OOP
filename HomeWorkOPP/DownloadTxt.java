package HomeWorkOPP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DownloadTxt implements Serializable {

    public Person DownloadFromTxt() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.out"));
        Person restored = (Person) objectInputStream.readObject();
        objectInputStream.close();
        return restored;
    }

}
