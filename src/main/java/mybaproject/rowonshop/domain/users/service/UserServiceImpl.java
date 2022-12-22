package mybaproject.rowonshop.domain.users.service;

import java.util.HashMap;
import java.util.List;
import mybaproject.rowonshop.global.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import mybaproject.rowonshop.global.dao.UserMapper;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    private final UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public void SignUp(User user){
        userMapper.SignUp(user);
    }

}
