package com.example.amigoscode.loginregistration.loginfromAmigoscode.user;

import com.example.amigoscode.loginregistration.loginfromAmigoscode.appuser.AppUser;
import com.example.amigoscode.loginregistration.loginfromAmigoscode.appuser.AppUserRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final AppUserRepository appUserRepository;
    @GetMapping
    public UserDataMapping getAllUser() throws Exception {
        List<UserDTO> ListDTO = getUserDTOS();
        return UserDataMapping.builder().data(ListDTO).build();
    }

    @NotNull
    private List<UserDTO> getUserDTOS() throws Exception {
        List<UserDTO> ListDTO = new ArrayList<>();
        List<AppUser> appUsers = appUserRepository.findAll();

        if (appUsers.isEmpty()) {
            String MessageExeption = "Belom ada user yang register broh";
            throw new Exception(MessageExeption);
        }

        appUsers.forEach(idx ->
                        {
                            UserDTO userDTO = new UserDTO();
                            userDTO.setFirstName(idx.getFirstName());
                            userDTO.setEmail(idx.getEmail());
                            ListDTO.add(userDTO);
                        }
                );
        return ListDTO;
    }

}
