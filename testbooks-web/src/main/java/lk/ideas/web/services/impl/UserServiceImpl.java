package lk.ideas.web.services.impl;

import lk.ideas.domain.application.User;
import lk.ideas.repository.UserRepository;
import lk.ideas.web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsersByUserName(String userName) {
        return userRepository.findUsersByUserName(userName);
    }
}
