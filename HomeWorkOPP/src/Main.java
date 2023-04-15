package HomeWorkOPP.src;

import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.person.Gender;
import HomeWorkOPP.src.person.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Geo Tree for Human");
        GeoTree<Person> gt = new GeoTree<Person>();
        Service<Person> service = new Service<>(gt);
        Person Irina = new Person("Irina", Gender.female, 40);
        Person Masha = new Person("Masha", Gender.female, 16);
        Person Vasja = new Person("Vasja", Gender.male, 35);
        Person Viktor = new Person("Viktor", Gender.male, 10);
        Person Stepan = new Person("Stepan", Gender.male, 70);
        service.addNode(Irina, Relationship.parent, Masha);
        service.addNode(Vasja, Relationship.parent, Viktor);
        service.addNode(Stepan, Relationship.parent, Irina);
        for (Person p : gt) {
            System.out.println(p);
        }

        // ** FindByPerson */
        System.out.println();
        System.out.println(gt.findByPerson(Irina));

        // ** Sort By Name */
        // System.out.println();
        // gt.sortByName();
        // for (Person p : gt) {
        // System.out.println(p);
        // }
        // System.out.println();

        // ** Sort By Age */
        // gt.sortByAge();
        // System.out.println();
        // for (Person p : gt) {
        // System.out.println(p);
        // }
        // System.out.println();

        // ** Upload */
        // InOut<Person> inOut = new InOut<>();
        // inOut.fileUpload(gt);
        // System.out.println(gt);

        // ** Download */
        // GeoTree gtIn = null;
        // gtIn = inOut.fileDownload();
        // System.out.println(gtIn);
    }

}
