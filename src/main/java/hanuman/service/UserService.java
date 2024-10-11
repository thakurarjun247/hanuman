package hanuman.service;

import hanuman.entity.User;
import hanuman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return userRepository.save(user);
    }

    public Optional<User> getUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
