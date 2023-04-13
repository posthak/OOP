package HomeWorkOPP.src;

import HomeWorkOPP.src.dog.Dog;
import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.person.Gender;
import HomeWorkOPP.src.person.Person;

public class Main {
    public static void main(String[] args) {

        /// ** Add in geo Tree and Display for Human
        System.out.println();
        System.out.println("Geo Tree for Human");
        Person irina = new Person("Irina", Gender.female, 40);
        Person vasya = new Person("Vasja", Gender.male, 35);
        Person masha = new Person("Masha", Gender.female, 38);
        Person viktor = new Person("Viktor", Gender.male, 46);
        GeoTree<Person> gt = new GeoTree<Person>();
        gt.append(irina, Relationship.parent, irina);
        gt.append(viktor, Relationship.parent, irina);
        gt.append(vasya, Relationship.parent, vasya);
        gt.append(masha, Relationship.parent, masha);
        // Service<Person> r = new Service<>(gt);
        for (Node<Person> p : gt) {
            System.out.println(p.getP1());
        }

        System.out.println();

        /// ** Add in geo Tree and Display for Dogs
        System.out.println("Geo Tree for Dogs");
        Dog strelka = new Dog("Strelka", Gender.female, 4);
        Dog belka = new Dog("Belka", Gender.female, 5);

        GeoTree<Dog> gt2 = new GeoTree<Dog>();
        gt2.append(strelka, Relationship.parent, strelka);
        gt2.append(belka, Relationship.parent, belka);

        Service<Dog> r = new Service<>(gt2);
        System.out.println();
        for (Node<Dog> p : gt2) {
            System.out.println(p.getP1());
        }
        System.out.println();

        r.sortByName();
        for (Node<Dog> p : gt2) {
            System.out.println(p.getP1());
        }
        // System.out.println(gt2.getTree());
        // for (Node<Dog> p : gt2) {
        // System.out.println(p.getP1());
        // }
        // System.out.println();
        // System.out.println(r.byPerson(viktor));

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
