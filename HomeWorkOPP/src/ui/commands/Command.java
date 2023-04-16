package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public abstract class Command implements Option {
    private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}
