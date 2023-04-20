package mybaproject.rowonshop.domain.users.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import mybaproject.rowonshop.global.dto.User;
import org.springframework.stereotype.Service;


public interface UserService {
    List<User> getUserList();

    void SignUp(User user);

    List<User> userIdContains (String userId);

    List<User> EmailContains (String emailaddress);

    Optional<User> findUserById(String userId);
}