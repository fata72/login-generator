package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator lg;
    private LoginService ls;

    @Before
    public void setUp() throws Exception {
        ls = new LoginService( new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"} );
        lg = new LoginGenerator(ls);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        lg.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(ls.loginExists("PDUR"));
    }

    @Test
    public void generateLoginForSameName() {
        lg.generateLoginForNomAndPrenom("Ralling", "John");
        assertTrue(ls.loginExists("JRAL2"));
    }

}