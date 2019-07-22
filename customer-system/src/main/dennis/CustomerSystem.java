package src.main.dennis;

import java.util.List;

public class CustomerSystem {
    private UserRepository userRepository;

    public CustomerSystem(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUserById(String id) {
        return this.userRepository.find(id);
    }
}
