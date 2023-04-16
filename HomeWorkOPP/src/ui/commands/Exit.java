package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class Exit extends Command {

    public Exit(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Закончить работу";
    }

    @Override
    public void execute() {
        getConsole().finish();
    }
}
