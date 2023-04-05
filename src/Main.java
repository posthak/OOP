package src;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.female, "40");
        Person vasya = new Person("Вася", Gender.male, "44");
        Person masha = new Person("Маша", Gender.female, "12");
        Person dasha = new Person("Даша", Gender.female, "10");

        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya);
        gt.append(irina, Relationship.children, masha);
        gt.append(vasya, Relationship.children, dasha);

        Research r = new Research(gt);
        // System.out.println(r.byPerson(vasya));
        // System.out.println(r.byPerson(irina));
        System.out.println(r.AllTree());

    }

}
