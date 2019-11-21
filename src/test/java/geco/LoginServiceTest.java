package geco;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private LoginService ls;
    List<String> resul = new ArrayList<String>();
    List<String> resulV = new ArrayList<String>();

    //coucou
    @Before
    public void setUp() throws Exception {

        String[] logins = {"l1"};
        resul.add("l1");
        ls = new LoginService(logins);

    }

    @Test
    public void loginExists() {
        assertTrue(ls.loginExists("l1"));
        assertFalse(ls.loginExists("l2"));
    }

    @Test
    public void addLogin() {
        ls.addLogin("l2");
    }

    @Test
    public void findAllLoginsStartingWith() {
        assertEquals(ls.findAllLoginsStartingWith("l"), resul);
        assertEquals(ls.findAllLoginsStartingWith("e"), resulV);
    }

    @Test
    public void findAllLogins() {
        assertEquals(ls.findAllLogins(), resul);
    }
}
