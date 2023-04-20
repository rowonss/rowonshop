package mybaproject.rowonshop.Security;

import mybaproject.rowonshop.domain.users.service.UserService;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MyUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public MyUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<mybaproject.rowonshop.global.dto.User> findeOne = userService.findUserById(username);
        if(findeOne.isEmpty()){
            throw new UsernameNotFoundException("존재하지 않음");
        }
        else{
            return User.builder()
                    .username(findeOne.get().getUserId())
                    .password(findeOne.get().getUserPassword())
                    .build();
        }
    }
}
