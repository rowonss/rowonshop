package mybaproject.rowonshop.global.dao;

import java.util.HashMap;
import java.util.List;
import mybaproject.rowonshop.global.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUserList();

    void SignUp(HashMap<String, Object> user);
}
