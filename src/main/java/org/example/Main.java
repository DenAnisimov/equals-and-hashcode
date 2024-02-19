package org.example;

import org.example.model.User;
import org.example.model.enums.Role;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Login", "Password", Role.USER);
        User user2 = new User("Login", "NewPassword", Role.USER);
        User user3 = new User("Login", "NewPassword", Role.USER);
        User user4 = new User("Admin", "admin", Role.ADMIN);
        
        System.out.println("equals(Object obj)");
        System.out.println("Рефликтивность: " + user1.equals(user1));
        System.out.println("Симметричность: " + user1.equals(user2) + " " + user2.equals(user1));
        System.out.println("Транзитивность: " + user1.equals(user2) + " " + user2.equals(user3) + " " + user1.equals(user3));
        System.out.println("Согласованность: на протяжении " +
                "всей программы результаты equals не менялись ");
        System.out.println("Сравнение null: " + user1.equals(null));

        System.out.println("\nhashCode");
        System.out.println(user1.hashCode() + " " + user1.hashCode());
        System.out.println(user1.hashCode() + " " + user2.hashCode());
        System.out.println(user1.hashCode() + " " + user4.hashCode());
    }
    static int indexFor(int h, int length) {
        return h & (length-1);
    }
}