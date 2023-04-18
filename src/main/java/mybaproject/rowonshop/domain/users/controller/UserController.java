package mybaproject.rowonshop.domain.users.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import mybaproject.rowonshop.domain.users.service.EmailService;
import mybaproject.rowonshop.global.dto.Mail;
import mybaproject.rowonshop.global.dto.User;
import mybaproject.rowonshop.domain.users.service.UserService;
import org.springframework.web.bind.annotation.*;

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
    public void userSignUp(@RequestParam("userId") String userId,
                           @RequestParam("userPassword") String userPassword,
                           @RequestParam("userName") String userName,
                           @RequestParam("userNickname") String userNickname,
                           @RequestParam("userEmail") String userEmail,
                           @RequestParam("useraddressMain") String useraddressMain,
                           @RequestParam("useraddressSub") String useraddressSub,
                           @RequestParam("useraddressCode") String useraddressCode) {

        User user = new User(userId, userPassword, userName, userNickname, userEmail, useraddressMain, useraddressSub, useraddressCode);

        userService.SignUp(user);
    }
    @PostMapping("/sendmail")
    public String sendmail(Mail mail) throws Exception {

        if(userService.EmailContains(mail.getAddress()).size() > 0){
            return "false";
        }

        return emailService.sendSimpleMessage(mail.getAddress());
    }

    @PostMapping("/userIdContains")
    public boolean userIdcontains(@RequestParam("userId") String userId) {

        return userService.userIdContains(userId).size() == 0;
    }

}
