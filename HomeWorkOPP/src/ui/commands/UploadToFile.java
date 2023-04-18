package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class UploadToFile extends Command {

    public UploadToFile(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Выгрузить дерево в файл";
    }

    @Override
    public void execute() {
        getConsole().upload();
    }
}