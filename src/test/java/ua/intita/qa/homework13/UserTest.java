package ua.intita.qa.homework13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.intita.qa.homework13.exceptions.UserCreateException;

public class UserTest {

    User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void checkNamePositive() {
        Assert.assertEquals("Tom", user.checkName("Tom"));
    }

    @Test(expected = UserCreateException.class)
    public void checkNameNegative() {
        user.checkName("tom");
    }

    @Test
    public void checkSurnamePositive() {
        Assert.assertEquals("Zucerberg", user.checkName("Zucerberg"));
    }

    @Test(expected = UserCreateException.class)
    public void checkSurnameNegative() {
        user.checkName("zucerberg");
    }

    @Test
    public void checkAgePositive() {
        Assert.assertEquals(5.5, user.checkAge(5.5), 0.01);
    }

    @Test(expected = UserCreateException.class)
    public void checkAgeNegative() {
        user.checkAge(0.0);
    }

    @Test
    public void checkEmailPositive() {
        Assert.assertEquals("test@domain.net", user.checkEmail("test@domain.net"));
    }

    @Test(expected = UserCreateException.class)
    public void checkEmailNegative() {
        user.checkEmail("test@domain@net");
    }

    @Test
    public void checkPasswordPositive() {
        Assert.assertEquals("Qq12qwerty", user.checkPassword("Qq12qwerty"));
    }

    @Test(expected = UserCreateException.class)
    public void checkPasswordNegative() {
        user.checkPassword("q12qwerty");
    }

}