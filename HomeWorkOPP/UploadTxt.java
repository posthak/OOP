package HomeWorkOPP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UploadTxt implements Serializable {

    public void SaveToTxt(Person p) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.out"));
        objectOutputStream.writeObject(p);
        objectOutputStream.close();

    }

}
