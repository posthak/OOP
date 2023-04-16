package HomeWorkOPP.src;

import HomeWorkOPP.src.presenter.Presenter;
import HomeWorkOPP.src.ui.Console;
import HomeWorkOPP.src.ui.View;

public class Main {
    public static void main(String[] args) {

        View view = new Console();
        new Presenter(view);
        view.start();

        // System.out.println("Geo Tree for Human");
        // GeoTree gt = new GeoTree();
        // Service service = new Service(gt);
        // service.addPerson("Irina", 40, Gender.female);
        // service.addPerson("Vasja", 35, Gender.male);
        // service.addPerson("Viktor", 10, Gender.male);
        // service.addPerson("Stepan", 70, Gender.male);
        // service.addPerson("Masha", 16, Gender.female);
        // for (Person p : gt) {
        // System.out.println(p);
        // }
        // System.out.println();
        // service.addNode("Irina", Relationship.parent, "Masha");
        // service.addNode("Vasja", Relationship.parent, "Viktor");
        // service.addNode("Stepan", Relationship.parent, "Irina");
        // // ** getAllTree */
        // System.out.println();
        // System.out.println(service.getNodeList());

        // ** FindByPerson */
        // System.out.println();
        // System.out.println(service.findByPerson("Irina"));

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
