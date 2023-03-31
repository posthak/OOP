package src;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person dasha = new Person("Даша");

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya);
        gt.append(irina, Relationship.children, masha);
        gt.append(vasya, Relationship.children, dasha);

        Research r = new Research(gt);
        System.out.println(r.byPerson(vasya));
        // System.out.println(r.byPerson(irina));
        // System.out.println(r.AllTree());

    }

}
