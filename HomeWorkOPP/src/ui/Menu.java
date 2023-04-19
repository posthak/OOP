package HomeWorkOPP.src.ui;

import java.util.ArrayList;
import java.util.List;

import HomeWorkOPP.src.ui.commands.AddNode;
import HomeWorkOPP.src.ui.commands.AddPerson;
import HomeWorkOPP.src.ui.commands.DelPerson;
import HomeWorkOPP.src.ui.commands.DownloadFromFile;
import HomeWorkOPP.src.ui.commands.Exit;
import HomeWorkOPP.src.ui.commands.FindByPerson;
import HomeWorkOPP.src.ui.commands.GetNodeList;
import HomeWorkOPP.src.ui.commands.GetPerson;
import HomeWorkOPP.src.ui.commands.Option;
import HomeWorkOPP.src.ui.commands.UploadToFile;

public class Menu {
    private List<Option> commands;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddPerson(console));
        commands.add(new AddNode(console));
        commands.add(new DelPerson(console));
        commands.add(new GetPerson(console));
        commands.add(new GetNodeList(console));
        commands.add(new UploadToFile(console));
        commands.add(new DownloadFromFile(console));
        commands.add(new FindByPerson(console));
        commands.add(new Exit(console));
    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
