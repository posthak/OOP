package HomeWorkOPP.src.ui;

import HomeWorkOPP.src.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);
}
