package pl.sulazula.javajs.repository;

import org.springframework.stereotype.Repository;
import pl.sulazula.javajs.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }

    public User save(User user) {
        users.add(user);

        return user;
    }

    public boolean delete(User user) {

        return users.remove(user);
    }
}
