package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.User;
import org.example.model.enums.Role;

import java.util.List;

@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private List<User> users;

    public List<User> getByRole(Role role) {
        return users.stream().filter(user -> user.getRole() == role).toList();
    }
}
