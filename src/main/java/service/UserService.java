package service;

import entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers(); //wyciąganie userów

    void addUser(User user); //dodawanie usera

    void removeUserById(Long userId); //usuwanie usera


}
