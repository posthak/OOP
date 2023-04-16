package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class GetNodeList extends Command {

    public GetNodeList(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Получить дерево";
    }

    @Override
    public void execute() {
        getConsole().getNodeList();
    }
}
