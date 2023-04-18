package HomeWorkOPP.src;

import HomeWorkOPP.src.presenter.Presenter;
import HomeWorkOPP.src.ui.Console;
import HomeWorkOPP.src.ui.View;

public class Main {
    public static void main(String[] args) {

        View view = new Console();
        new Presenter(view);
        view.start();
    }

}
