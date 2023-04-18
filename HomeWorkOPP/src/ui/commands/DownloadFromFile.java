package HomeWorkOPP.src.ui.commands;

import HomeWorkOPP.src.ui.Console;

public class DownloadFromFile extends Command {

    public DownloadFromFile(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Загрузить дерево из файла";
    }

    @Override
    public void execute() {
        getConsole().download();
    }
}