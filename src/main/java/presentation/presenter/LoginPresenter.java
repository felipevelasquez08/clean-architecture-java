package presentation.presenter;

import domain.repository.LoginRepository;
import domain.service.LoginService;
import infrastructure.repository.LoginRepositoryImpl;

public class LoginPresenter {

    private LoginService loginService;

    public LoginPresenter() {
        LoginRepository loginRepository = new LoginRepositoryImpl();
        this.loginService = new LoginService(loginRepository);
    }

    public void login(String email, String password) {
        try {
            boolean isLogin = loginService.login(email, password);
            if (isLogin){
                System.out.println("Inicio de sesion exitoso.");
            }else {
                System.out.println("Datos incorrectos.");
            }
        } catch (Exception exception) {
            System.out.println("Tenemos problemas con el inicio de sesión: " + exception);
        }

    }
}
