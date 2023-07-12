package domain.repository;

import domain.model.Login;

public interface LoginRepository {
    boolean login(Login login);
}
