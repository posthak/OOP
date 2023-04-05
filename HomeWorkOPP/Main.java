package HomeWorkOPP;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person irina = new Person("Irina", Gender.female, "40");
        Person vasya = new Person("Vasja", Gender.male, "44");
        Person masha = new Person("Masha", Gender.female, "12");
        Person dasha = new Person("Dasha", Gender.female, "10");

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya);
        gt.append(irina, Relationship.children, masha);
        gt.append(vasya, Relationship.children, dasha);

        Research r = new Research(gt);
        // System.out.println(r.byPerson(vasya));
        // System.out.println(r.AllTree());
        r.fileUpload();
        r.fileDownload();
    }

}
