package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {
    @Test //sprawdzeni cz poprawnie zwraca userów
    public void testGetAllUsers() {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(11, "admin", "admin"));
        users.add(new User(21, "Lukasz", "admin"));

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();

        //exected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void addUser() {
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(11, "admin", "admin");
        users.add(user);

        //then
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testRemoveUser() {
        //is
        List<User> users = new ArrayList<User>();
        User admin = new User((int) 1l, "admin", "admin");
        User pablo = new User((int) 2l, "Lukasz", "admin");
        users.add(admin);
        users.add(pablo);

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(1l);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }
}
