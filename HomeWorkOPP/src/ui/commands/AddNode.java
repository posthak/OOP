package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class AddNode extends Command {

    public AddNode(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить связь в дерево";
    }

    @Override
    public void execute() {
        getConsole().addNode();
    }
}
