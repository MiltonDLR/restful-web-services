package com.milton.rest.webservices.restfulwebservices.restfulwebservices.users;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Eve", LocalDate.now().minusYears(22)));
        users.add(new User(3, "Jim", LocalDate.now().minusYears(51)));
        users.add(new User(4, "Sara", LocalDate.now().minusYears(18)));
        users.add(new User(5, "Paola", LocalDate.now().minusYears(6)));

    }

    public List<User> findAll() {
        return users;
    }

    //public User save(User user) {

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

    //public List<User> findAll() {

    //public User save(User user) {

    //public User findOne (int id) {

}
