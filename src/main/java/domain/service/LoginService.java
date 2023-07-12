package domain.service;

import domain.exception.EmptyEmailException;
import domain.model.Login;
import domain.repository.LoginRepository;

public class LoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public boolean login(String email, String password) throws EmptyEmailException {
        Login login = new Login(email, password);
        return loginRepository.login(login);
    }
}
