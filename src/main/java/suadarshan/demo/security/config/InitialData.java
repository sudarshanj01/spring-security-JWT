package suadarshan.demo.security.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import suadarshan.demo.security.entity.User;
import suadarshan.demo.security.repository.UserRepository;

import java.util.List;

@Component
public class InitialData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public InitialData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(
                null,
                "john",
                passwordEncoder.encode("password"),
                "ROLE_USER"
        );

        User user2 = new User(
                null,
                "jane",
                passwordEncoder.encode("password"),
                "ROLE_ADMIN"
        );

        userRepository.saveAll(List.of(user1, user2));

    }
}
