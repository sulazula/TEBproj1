package pl.sulazula.javajs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sulazula.javajs.model.User;
import pl.sulazula.javajs.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public Optional<User> findByName(String name) {

        return userRepository.findByName(name);
    }

    public User save(User user) {

        return userRepository.save(user);
    }

    public boolean delete(User user) {

        return userRepository.delete(user);
    }
}
