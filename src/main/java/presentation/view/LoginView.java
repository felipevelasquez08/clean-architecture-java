package presentation.view;

import presentation.presenter.LoginPresenter;

public class LoginView {

    private LoginPresenter loginPresenter = new LoginPresenter();

    public void formLogin(String email, String password) {
        loginPresenter.login(email, password);
    }
}
