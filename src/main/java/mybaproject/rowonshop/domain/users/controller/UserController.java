package mybaproject.rowonshop.domain.users.controller;

import java.util.List;
import mybaproject.rowonshop.global.dto.User;
import mybaproject.rowonshop.domain.users.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
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

}
