package infrastructure.repository;

import domain.model.Login;
import domain.repository.LoginRepository;

public class LoginRepositoryImpl implements LoginRepository {

    @Override
    public boolean login(Login login) {
        String email = "example@yopmail.com";
        String password = "p455w0rd2023";
        return email.equalsIgnoreCase(login.getEmail()) && password.equalsIgnoreCase(login.getPassword());
    }
}
