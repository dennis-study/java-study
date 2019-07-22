package src.main.dennis;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepository implements UserRepositoryInterface {
    private List<User> userList;

    public UserRepository(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public List<User> find(String id) {
        return this.userList.stream().filter(user -> id.equals(user.getId())).collect(Collectors.toList());
    }
}
