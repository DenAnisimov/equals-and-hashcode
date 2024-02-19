package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.model.enums.Role;

@Data
@AllArgsConstructor
public class User {
    private String login;
    private String password;
    private Role role;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        User user = (User) obj;

        return this.login.equals(user.login) &&
                this.role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return (this.login.length() + this.role.toString().length()) * 31;
    }
}
