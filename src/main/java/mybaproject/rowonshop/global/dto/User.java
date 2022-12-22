package mybaproject.rowonshop.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userNo;
    private String userId;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userJoinDate;
    private String userUpdateDate;

    public User (String userId,String userpassword, String userName, String userNickname){
        this.userId = userId;
        this.userPassword = userpassword;
        this.userName = userName;
        this.userNickname = userNickname;
    }
}


