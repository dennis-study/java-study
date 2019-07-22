package src.main.dennis;

import java.util.List;

public interface UserRepositoryInterface {
    List<User> find(String id);
}
