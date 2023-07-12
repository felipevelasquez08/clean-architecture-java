package domain.model;

import domain.exception.EmptyEmailException;

public class Login {
    private String email;
    private String password;

    public Login(String email, String password) throws EmptyEmailException {
        this.email = email;
        this.password = password;
        validateEmail();
    }

    private void validateEmail() throws EmptyEmailException {
        if (email.equalsIgnoreCase("")){
            throw new EmptyEmailException();
        }
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
