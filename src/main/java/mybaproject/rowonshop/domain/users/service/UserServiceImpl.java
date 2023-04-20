package mybaproject.rowonshop.domain.users.service;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import mybaproject.rowonshop.global.dto.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import mybaproject.rowonshop.global.dao.UserMapper;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final SqlSession sqlSession;

    public UserServiceImpl (SqlSession ss){
        this.sqlSession = ss;
    }

    @Override
    public List<User> getUserList() {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.getUserList();
    }

    @Override
    public void SignUp(User user){

        UserMapper um = sqlSession.getMapper(UserMapper.class);
        um.SignUp(user);
    }

    @Override
    public List<User> userIdContains(String userId) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.userIdContains(userId);
    }

    @Override
    public List<User> EmailContains(String emailaddress) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);

        return um.EmailContains(emailaddress);
    }


    @Override
    public Optional<User> findUserById(String userId) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.userIdContains(userId);
        if (userList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(userList.get(0));
    }


}
