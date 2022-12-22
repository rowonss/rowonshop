package mybaproject.rowonshop.domain.users.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import mybaproject.rowonshop.global.dto.User;
import mybaproject.rowonshop.domain.users.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        return userService.getUserList().get(0).getUserName();
    }

    @PostMapping("/SignUp")
    public void SignUp(User user) {

        System.out.println(user);

        Timestamp time = new Timestamp(System.currentTimeMillis());

        User s_user = new User(user.getUserMemberNum(), user.getUserId(), user.getUserPassword(), user.getUserNickname(), user.getUserName(), time.toString());

        userService.SignUp(s_user);
    }

}
