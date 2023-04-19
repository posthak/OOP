package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class FindByPerson extends Command {

    public FindByPerson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Найти человека в дереве";
    }

    @Override
    public void execute() {
        getConsole().findByPerson();
    }
}