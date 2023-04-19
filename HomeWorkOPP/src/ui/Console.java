package HomeWorkOPP.src.ui;

import java.util.Scanner;

import HomeWorkOPP.src.person.Gender;
import HomeWorkOPP.src.person.Relationship;
import HomeWorkOPP.src.presenter.Presenter;

public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    @Override
    public void start() {
        menu = new Menu(this);
        work = true;
        while (work) {
            scanner = new Scanner(System.in);
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void finish() {
        work = false;
    }

    public void addPerson() {
        String fulName;
        Integer age;
        Gender gender;

        System.out.println("Введите имя человека");
        fulName = scanner.nextLine();

        System.out.println("Введите возраст человека");
        age = scanner.nextInt();

        System.out.println("Введите номер пола 1.Female или 2.Male");
        if (scanner.nextInt() == 1) {
            gender = Gender.female;
        } else {
            gender = Gender.male;
        }
        presenter.addPerson(fulName, gender, age);
        presenter.getPersonList();
    }

    public void addNode() {
        String p1;
        String p2;

        System.out.println("Введите имя родителя");
        p1 = scanner.nextLine();

        System.out.println("Введите имя ребенка");
        p2 = scanner.nextLine();

        System.out.println("Связь Родитель- Ребенок будет добавлена автоматически");

        presenter.addNode(p1, Relationship.parent, p2);
        // presenter.getNode();
    }

    public void getPersonList() {
        presenter.getPersonList();
    }

    public void getNodeList() {
        presenter.getNodeList();
    }

    public void download() {
        presenter.download();
    }

    public void upload() {
        presenter.upload();
    }

    public void findByPerson() {
        String fulName;
        System.out.println("Введите имя человека для поиска в дереве?");
        fulName = scanner.nextLine();
        presenter.findByPerson(fulName);
    }

    public void delPerson() {
        String fulName;
        System.out.println("Введите имя человека для удаления");
        fulName = scanner.nextLine();
        presenter.delPerson(fulName);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}