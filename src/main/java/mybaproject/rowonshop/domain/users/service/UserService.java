package mybaproject.rowonshop.domain.users.service;

import java.util.List;
import mybaproject.rowonshop.global.dto.User;
import org.springframework.stereotype.Service;


public interface UserService {
    List<User> getUserList();
}