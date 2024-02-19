package example.service;

import org.example.model.User;
import org.example.model.enums.Role;
import org.example.service.UserServiceImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImlTest {
    private static User user1;
    private static User user2;
    private static User user3;
    private static User user4;
    private static User user5;
    private static UserServiceImpl userService;

    @BeforeClass
    public static void setUpBeforeClass() {
        user1 = new User("Login", "Password", Role.USER);
        user2 = new User("Login", "Password123", Role.USER);
        user3 = new User("Login", "Password12356", Role.ADMIN);
        user4 = new User("Login", "Password12356", Role.ADMIN);
        user5 = new User("Login", "Password123", Role.USER);
        List<User> allUsers = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));
        userService = new UserServiceImpl(allUsers);
    }

    @Test
    public void testGetUsersByRoleUser() {
        List<User> usersExpected = new ArrayList<>(Arrays.asList(user1, user2, user5));
        Role role = Role.USER;
        List<User> usersActual = userService.getByRole(role);

        Assert.assertEquals(usersExpected.size(), usersActual.size());
    }

    @Test
    public void testGetUsersByRoleAdmin() {
        List<User> usersExpected = new ArrayList<>(Arrays.asList(user3, user4));
        Role role = Role.ADMIN;
        List<User> usersActual = userService.getByRole(role);

        Assert.assertEquals(usersExpected.size(), usersActual.size());
    }
}
