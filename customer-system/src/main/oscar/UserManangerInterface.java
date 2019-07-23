package src.main.oscar;
import java.util.List;

public interface UserManangerInterface {

    List<User> readAll();
    User read(String id);
    User save(User user);
    User update(User user);
    User delete(User user);

}
