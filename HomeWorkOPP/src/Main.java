package HomeWorkOPP.src;

import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.geotree.Node;
import HomeWorkOPP.src.geotree.Relationship;
import HomeWorkOPP.src.person.Gender;
import HomeWorkOPP.src.person.Person;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Irina", Gender.female, 40);
        Person vasya = new Person("Vasja", Gender.male, 35);
        Person masha = new Person("Masha", Gender.female, 38);
        Person viktor = new Person("Viktor", Gender.male, 46);

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, irina);
        gt.append(masha, Relationship.parent, masha);
        gt.append(vasya, Relationship.parent, vasya);
        gt.append(viktor, Relationship.parent, viktor);

        // **Sort by Name \ by Age */
        for (Node node : gt.getTree()) {
            System.out.println(node);
        }
        Service r = new Service(gt);
        // r.sortByName();
        r.sortByAge();
        System.out.println();
        for (Node node : gt.getTree()) {
            System.out.println(node);
        }

        // ** Display by person / All */
        // System.out.println(r.byPerson(vasya));
        // System.out.println(r.allTree());

        // ** Upload */
        // InOut inOut = new InOut();
        // inOut.fileUpload(gt);
        // System.out.println(gt);

        // ** Download */
        // GeoTree gtIn = null;
        // gtIn = inOut.fileDownload();
        // System.out.println(gtIn);
    }

}
