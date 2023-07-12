import domain.exception.EmptyEmailException;
import domain.model.Login;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class LoginTest {
    @Test
    public void givenTheCreatedLogin_whenIsEmptyEmail_thenReturnEmptyEmailException() {
        try {
            new Login("", "password");
            fail("Expected EmptyEmailException");
        } catch (Exception exception) {
            assertInstanceOf(EmptyEmailException.class, exception);
        }
    }

    @Test
    public void givenTheCreatedLogin_whenAllFieldCorrect_thenReturnObjectLogin() throws EmptyEmailException {
        Login login = new Login("a@a.com", "password");
        assertNotNull(login);
    }
}
