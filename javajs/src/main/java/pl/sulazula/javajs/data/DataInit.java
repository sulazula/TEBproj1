package pl.sulazula.javajs.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.sulazula.javajs.model.User;
import pl.sulazula.javajs.repository.UserRepository;

@Component
public class DataInit implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Bob", 22, "bob@bob.pl");
        User user2 = new User("Jane", 23, "jane@jane.pl");
        userRepository.save(user1);
        userRepository.save(user2);
    }
}
