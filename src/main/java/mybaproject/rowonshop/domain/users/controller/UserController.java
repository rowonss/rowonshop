package mybaproject.rowonshop.domain.users.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import mybaproject.rowonshop.domain.users.service.EmailService;
import mybaproject.rowonshop.global.dto.Mail;
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

    private final EmailService emailService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        return userService.getUserList().get(0).getUserName();
    }

    @PostMapping("/userSignUp")
    public void SignUp(User user) {

        User s_user = new User( user.getUserId(),user.getUserPassword(),user.getUserName(), user.getUserNickname(), user.getUserEmail());

        userService.SignUp(s_user);
    }
    @PostMapping("/sendmail")
    public String sendmail(Mail mail) throws Exception {

        System.out.println(userService.EmailContains(mail.getAddress()));

        if(userService.EmailContains(mail.getAddress()).size() > 0){
            System.out.println("왜이래");
            return "false";
        }

        return emailService.sendSimpleMessage(mail.getAddress());
    }

}
