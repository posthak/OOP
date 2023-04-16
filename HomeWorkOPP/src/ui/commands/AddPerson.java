package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class AddPerson extends Command {

    public AddPerson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить нового человека";
    }

    @Override
    public void execute() {
        getConsole().addPerson();
    }
}
