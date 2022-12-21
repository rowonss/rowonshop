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

    private Integer userMemberNum;
    private String userId;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userCreatedDate;

}
