package lk.ideas.web.services;

import java.util.List;
import lk.ideas.domain.application.User;

public interface UserService {

//    String authenticateUser(String username, String password);

    List<User> getUsersByUserName(String user);
}
