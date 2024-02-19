package example.model;

import org.example.model.User;
import org.example.model.enums.Role;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    private static User user1;
    private static User user2;
    private static User user3;

    public void setUpBeforeClass() {
        user1 = new User("Login", "Password", Role.USER);
        user2 = new User("Login", "Password123", Role.USER);
        user3 = new User("Login", "Password12356", Role.USER);
    }

    @Test
    public void testEqualsReflexivity() {
        user1 = new User("Login", "Password", Role.USER);

        boolean expected = true;
        boolean actual = user1.equals(user1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEqualsSymmetry() {
        user1 = new User("Login", "Password", Role.USER);
        user2 = new User("Login", "Password123", Role.USER);

        boolean expected = true;
        boolean actual = user1.equals(user2) && user2.equals(user1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTransitivity() {
        user1 = new User("Login", "Password", Role.USER);
        user2 = new User("Login", "Password123", Role.USER);
        user3 = new User("Login", "Password12356", Role.USER);

        boolean expected = true;
        boolean actual = user1.equals(user2) &&
                user2.equals(user3) && user1.equals(user3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEqualsNullComparison() {
        user1 = new User("Login", "Password", Role.USER);

        boolean expected = false;
        boolean actual = user1.equals(null);
        Assert.assertEquals(expected, actual);
    }
}
