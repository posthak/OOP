package HomeWorkOPP.src;

import HomeWorkOPP.src.dog.Dog;
import HomeWorkOPP.src.geotree.GeoTree;
import HomeWorkOPP.src.person.Gender;
import HomeWorkOPP.src.person.Person;

public class Main {
    public static void main(String[] args) {

        /// ** Add in geo Tree and Display for Human
        Person irina = new Person("Irina", Gender.female, 40);
        Person vasya = new Person("Vasja", Gender.male, 35);
        Person masha = new Person("Masha", Gender.female, 38);
        Person viktor = new Person("Viktor", Gender.male, 46);
        GeoTree<Person> gt = new GeoTree<Person>();
        gt.append(irina, Relationship.parent, irina);
        gt.append(viktor, Relationship.parent, irina);
        gt.append(vasya, Relationship.parent, vasya);
        gt.append(masha, Relationship.parent, masha);
        Service<Person> r = new Service<>(gt);
        System.out.println();

        System.out.println(r.getTree());

        System.out.println();
        System.out.println(r.byPerson(viktor));

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
