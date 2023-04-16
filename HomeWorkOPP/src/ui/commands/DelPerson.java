package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class DelPerson extends Command {

    public DelPerson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить запись";
    }

    @Override
    public void execute() {
        System.out.println("Удаляю...");
        getConsole().delPerson();
    }
}
