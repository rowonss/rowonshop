package mybaproject.rowonshop.global.dto;

import lombok.*;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userUUID;
    private String userId;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userJoinDate;
    private String userUpdateDate;
    private String userEmail;
    private String useraddressMain;
    private String useraddressSub;
    private String useraddressCode;


    @Builder
    public User (String userId,String userpassword, String userName, String userNickname, String userEmail, String useraddressMain, String useraddressSub, String useraddressCode){
        this.userId = userId;
        this.userPassword = userpassword;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userEmail = userEmail;
        this.useraddressMain = useraddressMain;
        this.useraddressSub = useraddressSub;
        this.useraddressCode = useraddressCode;
    }
}


