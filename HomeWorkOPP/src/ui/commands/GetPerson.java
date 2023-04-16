package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class GetPerson extends Command {

    public GetPerson(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Получить список людей";
    }

    @Override
    public void execute() {
        getConsole().getPersonList();
    }
}
