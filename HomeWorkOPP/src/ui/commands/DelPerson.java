package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class DelPerson extends Command {

    public DelPerson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить человека и списка";
    }

    @Override
    public void execute() {
        getConsole().delPerson();
    }
}
