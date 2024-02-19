package org.example.service;

import org.example.model.User;
import org.example.model.enums.Role;

import java.util.List;

public interface UserService {
    List<User> getByRole(Role role);
}
